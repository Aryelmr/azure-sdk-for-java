// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for DiscoveredSecuritySolutions List. */
public final class DiscoveredSecuritySolutionsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/DiscoveredSecuritySolutions/GetDiscoveredSecuritySolutionsSubscription_example.json
     */
    /**
     * Sample code: Get discovered security solutions.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getDiscoveredSecuritySolutions(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.discoveredSecuritySolutions().list(Context.NONE);
    }
}