// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dashboard.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dashboard.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.dashboard.models.PrivateEndpoint;
import com.azure.resourcemanager.dashboard.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.dashboard.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionPropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"privateEndpoint\":{\"id\":\"ysszdnrujqguh\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"qfprwzwbn\",\"actionsRequired\":\"itnwuizgazxufi\"},\"groupIds\":[\"kyfi\",\"rfidfvzwdz\"],\"provisioningState\":\"Succeeded\"}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qfprwzwbn", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("itnwuizgazxufi", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("kyfi", model.groupIds().get(0));
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("qfprwzwbn")
                        .withActionsRequired("itnwuizgazxufi"))
                .withGroupIds(Arrays.asList("kyfi", "rfidfvzwdz"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("qfprwzwbn", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("itnwuizgazxufi", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("kyfi", model.groupIds().get(0));
    }
}