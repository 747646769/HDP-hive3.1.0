/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.shims;

import org.apache.hadoop.yarn.server.MiniYARNCluster;

/**
 * This should be a very thin wrapper of MiniYARNCluster, which helps to build a embedded YARN
 * cluster for Spark.
 */
public class MiniSparkOnYARNCluster20 extends MiniYARNCluster {

  public MiniSparkOnYARNCluster20(String testName) {
    this(testName, 1, 1);
  }

  public MiniSparkOnYARNCluster20(String testName, int numResourceManagers, int numNodeManagers) {
    this(testName, numResourceManagers, numNodeManagers, 1, 1);
  }

  public MiniSparkOnYARNCluster20(String testName, int numResourceManagers,
    int numNodeManagers, int numLocalDirs, int numLogDirs) {
    super(testName, numResourceManagers, numNodeManagers, numLocalDirs, numLogDirs);
  }
}