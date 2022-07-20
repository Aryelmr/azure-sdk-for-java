// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated;

import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/relay/resource-manager/Microsoft.Relay/stable/2017-04-01/examples/RelayOperations_List.json
     */
    /**
     * Sample code: RelayOperationsList.
     *
     * @param manager Entry point to RelayManager.
     */
    public static void relayOperationsList(com.azure.resourcemanager.relay.RelayManager manager) {
        manager.operations().list(Context.NONE);
    }
}