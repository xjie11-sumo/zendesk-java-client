package org.zendesk.client.v2;

import org.zendesk.client.v2.model.hc.Post;
import org.zendesk.client.v2.model.hc.PostComment;

import java.util.HashMap;

public class TestMain {
  public static void main(String args[]) {
    String token = System.getenv("ZENDESK_TOKEN");
    Zendesk zd = new Zendesk.Builder("https://sumologic1433568869.zendesk.com")
        .setUsername("xjie@sumologic.com")
        .setToken(token)
        .build();

    zd.getTopics().forEach(System.out::println);
    System.out.println(zd.getTopic(115000377147L));
    Post post = zd.createSingleCommunityPost("testing", "make sure this works", 115000377147L);
    System.out.println(post);
    System.out.println(zd.createSingleCommunityPostComment(post.getId(), "testing if this works1"));

  }
}
