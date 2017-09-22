package org.zendesk.client.v2;

import org.zendesk.client.v2.model.hc.PostComment;

import java.util.HashMap;

public class TestMain {
  public static void main(String args[]) {
    String token = System.getenv("ZENDESK_TOKEN");
    Zendesk zd = new Zendesk.Builder("https://sumologic1433568869.zendesk.com")
        .setUsername("xjie@sumologic.com")
        .setToken(token)
        .build();

    zd.getCommunityPostsSortByNewest().forEach(System.out::println);
    zd.getCommunityPostCommentsByPostId(115006620307L).forEach(System.out::println);

    System.out.println(zd.createSingleCommunityPostComment(115006620307L, "testing if this works1"));
  }
}
