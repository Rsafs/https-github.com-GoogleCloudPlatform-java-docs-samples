/*
 * Copyright 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.spanner;

//[START spring_data_spanner_album]
import com.google.cloud.spring.data.spanner.core.mapping.NotMapped;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import java.util.List;

/**
 * An entity class representing an Album.
 */
@Table(name = "Albums")
public class Album {

  @PrimaryKey
  long singerId;

  @PrimaryKey(keyOrder = 2)
  long albumId;

  String albumTitle;

  long marketingBudget;

  @NotMapped
  List<Album> relatedAlbums;

  public Album(long singerId, long albumId, String albumTitle, long marketingBudget) {
    this.singerId = singerId;
    this.albumId = albumId;
    this.albumTitle = albumTitle;
    this.marketingBudget = marketingBudget;
  }
}
//[END spring_data_spanner_album]
