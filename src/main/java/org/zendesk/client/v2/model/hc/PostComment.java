package org.zendesk.client.v2.model.hc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class PostComment {
  /** Automatically assigned when the subscription is created */
  private Long id;

  /** The API URL of the subscription */
  private String url;

  /** The community url of the post **/
  @JsonProperty("html_url")
  private String html_url;

  /** The details of the post **/
  @JsonProperty("body")
  private String body;

  /** The id of the author of the post. *Writable on create by Help Center managers **/
  @JsonProperty("author_id")
  private int author_id;

  /** The id of the post on which the comment was made **/
  @JsonProperty("post_id")
  private int post_id;

  /** Whether the comment is marked as official **/
  @JsonProperty("official")
  private boolean official;

  /** The total sum of votes on the post **/
  @JsonProperty("vote_sum")
  private int vote_sum;

  /** The number of votes cast on the post **/
  @JsonProperty("vote_count")
  private int vote_count;

  /** The time at which the subscription was created */
  @JsonProperty("created_at")
  private Date createdAt;

  /** The time at which the subscription was last updated */
  @JsonProperty("updated_at")
  private Date updatedAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getHtml_url() {
    return html_url;
  }

  public void setHtml_url(String html_url) {
    this.html_url = html_url;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public int getAuthor_id() {
    return author_id;
  }

  public void setAuthor_id(int author_id) {
    this.author_id = author_id;
  }

  public int getPost_id() {
    return post_id;
  }

  public void setPost_id(int post_id) {
    this.post_id = post_id;
  }

  public boolean getOfficial() {
    return official;
  }

  public void setOfficial(boolean official) {
    this.official = official;
  }

  public int getVote_sum() {
    return vote_sum;
  }

  public void setVote_sum(int vote_sum) {
    this.vote_sum = vote_sum;
  }

  public int getVote_count() {
    return vote_count;
  }

  public void setVote_count(int vote_count) {
    this.vote_count = vote_count;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "PostComment{" +
        "id=" + id +
        ", url='" + url + '\'' +
        ", html_url='" + html_url + '\'' +
        ", body='" + body + '\'' +
        ", author_id=" + author_id +
        ", post_id=" + post_id +
        ", official=" + official +
        ", vote_sum=" + vote_sum +
        ", vote_count=" + vote_count +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
