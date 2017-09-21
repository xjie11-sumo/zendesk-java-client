package org.zendesk.client.v2.model.hc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Post {

  /** Automatically assigned when the subscription is created */
  private Long id;

  /** The API URL of the subscription */
  private String url;

  @JsonProperty("html_url")
  private String html_url;

  @JsonProperty("title")
  private String title;

  @JsonProperty("details")
  private String details;

  @JsonProperty("author_id")
  private int author_id;

  @JsonProperty("pinned")
  private boolean pinned;

  @JsonProperty("featured")
  private boolean featured;

  @JsonProperty("closed")
  private boolean closed;

  @JsonProperty("status")
  private String status;

  @JsonProperty("vote_sum")
  private int vote_sum;

  @JsonProperty("vote_count")
  private int vote_count;

  @JsonProperty("comment_count")
  private int comment_count;

  @JsonProperty("follower_count")
  private int follower_count;

  @JsonProperty("topic_id")
  private int topic_id;

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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public int getAuthor_id() {
    return author_id;
  }

  public void setAuthor_id(int author_id) {
    this.author_id = author_id;
  }

  public boolean isPinned() {
    return pinned;
  }

  public void setPinned(boolean pinned) {
    this.pinned = pinned;
  }

  public boolean isFeatured() {
    return featured;
  }

  public void setFeatured(boolean featured) {
    this.featured = featured;
  }

  public boolean isClosed() {
    return closed;
  }

  public void setClosed(boolean closed) {
    this.closed = closed;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
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

  public int getComment_count() {
    return comment_count;
  }

  public void setComment_count(int comment_count) {
    this.comment_count = comment_count;
  }

  public int getFollower_count() {
    return follower_count;
  }

  public void setFollower_count(int follower_count) {
    this.follower_count = follower_count;
  }

  public int getTopic_id() {
    return topic_id;
  }

  public void setTopic_id(int topic_id) {
    this.topic_id = topic_id;
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
    return "Post{" +
        "id=" + id +
        ", url='" + url + '\'' +
        ", html_url='" + html_url + '\'' +
        ", title='" + title + '\'' +
        ", details='" + details + '\'' +
        ", author_id=" + author_id +
        ", pinned=" + pinned +
        ", featured=" + featured +
        ", closed=" + closed +
        ", status='" + status + '\'' +
        ", vote_sum=" + vote_sum +
        ", vote_count=" + vote_count +
        ", comment_count=" + comment_count +
        ", follower_count=" + follower_count +
        ", topic_id=" + topic_id +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
