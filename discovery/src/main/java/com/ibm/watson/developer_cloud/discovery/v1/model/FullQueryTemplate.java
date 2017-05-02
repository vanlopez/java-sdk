/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.discovery.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * FullQueryTemplate.
 */
public class FullQueryTemplate extends GenericModel {

  private String name;
  private String query;
  private String description;
  private List<FullQueryTemplateParameters> parameters;

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the query.
   *
   * @return the query
   */
  public String getQuery() {
    return query;
  }

  /**
   * Gets the description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the parameters.
   *
   * @return the parameters
   */
  public List<FullQueryTemplateParameters> getParameters() {
    return parameters;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Sets the query.
   *
   * @param query the new query
   */
  public void setQuery(final String query) {
    this.query = query;
  }

  /**
   * Sets the description.
   *
   * @param description the new description
   */
  public void setDescription(final String description) {
    this.description = description;
  }

  /**
   * Sets the parameters.
   *
   * @param parameters the new parameters
   */
  public void setParameters(final List<FullQueryTemplateParameters> parameters) {
    this.parameters = parameters;
  }
}