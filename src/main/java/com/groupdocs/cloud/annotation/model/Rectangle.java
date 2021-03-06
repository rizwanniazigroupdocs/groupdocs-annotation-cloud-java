/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Rectangle.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.annotation.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.annotation.model.ValueType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Rectangle
 */
public class Rectangle extends ValueType {
  @SerializedName("x")
  private Double X = null;

  @SerializedName("y")
  private Double Y = null;

  @SerializedName("width")
  private Double width = null;

  @SerializedName("height")
  private Double height = null;

  public Rectangle(Double x, Double y, Double width, Double height) {
    this.X = x;
    this.Y = y;
    this.width = width;
    this.height = height;
  }

   /**
   * Gets or sets the x.
   * @return X
  **/
  @ApiModelProperty(value = "Gets or sets the x.")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public Rectangle Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Gets or sets the y.
   * @return Y
  **/
  @ApiModelProperty(value = "Gets or sets the y.")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }

  public Rectangle width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Gets or sets the width.
   * @return width
  **/
  @ApiModelProperty(value = "Gets or sets the width.")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public Rectangle height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Gets or sets the height.
   * @return height
  **/
  @ApiModelProperty(value = "Gets or sets the height.")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return Objects.equals(this.X, rectangle.X) &&
        Objects.equals(this.Y, rectangle.Y) &&
        Objects.equals(this.width, rectangle.width) &&
        Objects.equals(this.height, rectangle.height) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y, width, height, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rectangle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

