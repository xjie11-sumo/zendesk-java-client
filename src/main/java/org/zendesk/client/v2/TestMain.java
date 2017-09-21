package org.zendesk.client.v2;

public class TestMain {
  public static void main(String args[]) {
    String token = System.getenv("ZENDESK_TOKEN");
    Zendesk zd = new Zendesk.Builder("https://sumologic1433568869.zendesk.com")
        .setOauthToken(token)
        .build();

    zd.getCommunityPosts().forEach(System.out::println);

  }
}
