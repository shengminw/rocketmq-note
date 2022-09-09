/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.store.config;

import java.io.File;

public class StorePathConfigHelper {

    public static String getStorePathConsumeQueue(final String rootDir) {
        return rootDir + File.separator + "consumequeue";
    }

    public static String getStorePathConsumeQueueExt(final String rootDir) {
        return rootDir + File.separator + "consumequeue_ext";
    }
    public static String getStorePathBatchConsumeQueue(final String rootDir) {
        return rootDir + File.separator + "batchconsumequeue";
    }

    public static String getStorePathIndex(final String rootDir) {
        return rootDir + File.separator + "index";
    }

    public static String getStoreCheckpoint(final String rootDir) {
        return rootDir + File.separator + "checkpoint";
    }

    // abort文件用于标识是否正常退出，abort文件只应该在运行期间存在，正常退出会删除该文件
    // 因此，存在该文件则说明上次的退出是异常退出
    public static String getAbortFile(final String rootDir) {
        return rootDir + File.separator + "abort";
    }

    public static String getLockFile(final String rootDir) {
        return rootDir + File.separator + "lock";
    }

    public static String getDelayOffsetStorePath(final String rootDir) {
        return rootDir + File.separator + "config" + File.separator + "delayOffset.json";
    }

    public static String getTranStateTableStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "statetable";
    }

    public static String getTranRedoLogStorePath(final String rootDir) {
        return rootDir + File.separator + "transaction" + File.separator + "redolog";
    }

}
