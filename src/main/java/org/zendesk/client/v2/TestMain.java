package org.zendesk.client.v2;

import java.util.HashMap;

public class TestMain {
  public static void main(String args[]) {
    String token = System.getenv("ZENDESK_TOKEN");
    Zendesk zd = new Zendesk.Builder("https://sumologic1433568869.zendesk.com")
        .setOauthToken(token)
        .build();

    zd.getCommunityPosts(new HashMap<>()).forEach(System.out::println);
    System.out.println("Start of newest");
    zd.getCommunityPostsSortByNewest().forEach(System.out::println);

  }
}
