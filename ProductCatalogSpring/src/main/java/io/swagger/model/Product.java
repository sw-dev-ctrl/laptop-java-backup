package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Category;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Product
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-12-12T03:03:41.245Z")

public class Product   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("mediaUrls")
  private List<String> mediaUrls = null;

  @JsonProperty("category")
  private List<Category> category = new ArrayList<Category>();

  public Product id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "monitor", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product mediaUrls(List<String> mediaUrls) {
    this.mediaUrls = mediaUrls;
    return this;
  }

  public Product addMediaUrlsItem(String mediaUrlsItem) {
    if (this.mediaUrls == null) {
      this.mediaUrls = new ArrayList<String>();
    }
    this.mediaUrls.add(mediaUrlsItem);
    return this;
  }

   /**
   * Get mediaUrls
   * @return mediaUrls
  **/
  @ApiModelProperty(value = "")


  public List<String> getMediaUrls() {
    return mediaUrls;
  }

  public void setMediaUrls(List<String> mediaUrls) {
    this.mediaUrls = mediaUrls;
  }

  public Product category(List<Category> category) {
    this.category = category;
    return this;
  }

  public Product addCategoryItem(Category categoryItem) {
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Category> getCategory() {
    return category;
  }

  public void setCategory(List<Category> category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.mediaUrls, product.mediaUrls) &&
        Objects.equals(this.category, product.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, mediaUrls, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mediaUrls: ").append(toIndentedString(mediaUrls)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

