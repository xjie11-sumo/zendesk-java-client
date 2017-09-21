package org.zendesk.client.v2;

import java.util.HashMap;

public class TestMain {
  public static void main(String args[]) {
    String token = System.getenv("ZENDESK_TOKEN");
    Zendesk zd = new Zendesk.Builder("https://sumologic1433568869.zendesk.com")
        .setOauthToken(token)
        .build();

    zd.getCommunityPostsSortByNewest().forEach(System.out::println);
    zd.getCommunityPostCommentsByPostId(115006620307L).forEach(System.out::println);
  }
}
