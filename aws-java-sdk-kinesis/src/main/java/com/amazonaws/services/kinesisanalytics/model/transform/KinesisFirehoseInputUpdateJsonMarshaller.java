/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.kinesisanalytics.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * KinesisFirehoseInputUpdateMarshaller
 */
public class KinesisFirehoseInputUpdateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(KinesisFirehoseInputUpdate kinesisFirehoseInputUpdate,
            StructuredJsonGenerator jsonGenerator) {

        if (kinesisFirehoseInputUpdate == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (kinesisFirehoseInputUpdate.getResourceARNUpdate() != null) {
                jsonGenerator.writeFieldName("ResourceARNUpdate").writeValue(
                        kinesisFirehoseInputUpdate.getResourceARNUpdate());
            }
            if (kinesisFirehoseInputUpdate.getRoleARNUpdate() != null) {
                jsonGenerator.writeFieldName("RoleARNUpdate").writeValue(
                        kinesisFirehoseInputUpdate.getRoleARNUpdate());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static KinesisFirehoseInputUpdateJsonMarshaller instance;

    public static KinesisFirehoseInputUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new KinesisFirehoseInputUpdateJsonMarshaller();
        return instance;
    }

}
