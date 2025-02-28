/*
 * Copyright (C) 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.cloud.teleport.v2.templates.constants;

/** A single class to store all constants. */
public class Constants {

  // Kafka property config name for bootstrap server.
  public static final String BOOTSTRAP_SERVER_CONFIG = "bootstrap.servers";

  // Kafka property config name for acks config.
  public static final String ACKS_CONFIG = "acks";

  // Kafka property config name for key serializer.
  public static final String KEY_SERIALIZER_CLASS_CONFIG = "key.serializer";

  // Kafka property config name for value serializer.
  public static final String VALUE_SERIALIZER_CLASS_CONFIG = "value.serializer";

  // Transaction tag prefix used in the forward migration job.
  public static final String FWD_MIGRATION_TRANSACTION_TAG_PREFIX = "txBy=";

  // Sink type - pubsub.
  public static final String PUBSUB_SINK = "pubsub";

  // Attribute key for shardId for pubsub messages.
  public static final String PUB_SUB_SHARD_ID_ATTRIBUTE = "shardId";

  // Sink type - kafka.
  public static final String KAFKA_SINK = "kafka";
}
