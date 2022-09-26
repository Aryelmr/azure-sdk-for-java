// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.LoadBalancerConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.PrivateIpAddress;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LoadBalancerConfigurationTests {
    @Test
    public void testDeserialize() {
        LoadBalancerConfiguration model =
            BinaryData
                .fromString(
                    "{\"privateIpAddress\":{\"ipAddress\":\"jye\",\"subnetResourceId\":\"kvnipjoxz\"},\"publicIpAddressResourceId\":\"chgejspodm\",\"loadBalancerResourceId\":\"lzydehojwyahux\",\"probePort\":1511051439,\"sqlVirtualMachineInstances\":[\"njaqwixjspro\",\"vcputegj\"]}")
                .toObject(LoadBalancerConfiguration.class);
        Assertions.assertEquals("jye", model.privateIpAddress().ipAddress());
        Assertions.assertEquals("kvnipjoxz", model.privateIpAddress().subnetResourceId());
        Assertions.assertEquals("chgejspodm", model.publicIpAddressResourceId());
        Assertions.assertEquals("lzydehojwyahux", model.loadBalancerResourceId());
        Assertions.assertEquals(1511051439, model.probePort());
        Assertions.assertEquals("njaqwixjspro", model.sqlVirtualMachineInstances().get(0));
    }

    @Test
    public void testSerialize() {
        LoadBalancerConfiguration model =
            new LoadBalancerConfiguration()
                .withPrivateIpAddress(new PrivateIpAddress().withIpAddress("jye").withSubnetResourceId("kvnipjoxz"))
                .withPublicIpAddressResourceId("chgejspodm")
                .withLoadBalancerResourceId("lzydehojwyahux")
                .withProbePort(1511051439)
                .withSqlVirtualMachineInstances(Arrays.asList("njaqwixjspro", "vcputegj"));
        model = BinaryData.fromObject(model).toObject(LoadBalancerConfiguration.class);
        Assertions.assertEquals("jye", model.privateIpAddress().ipAddress());
        Assertions.assertEquals("kvnipjoxz", model.privateIpAddress().subnetResourceId());
        Assertions.assertEquals("chgejspodm", model.publicIpAddressResourceId());
        Assertions.assertEquals("lzydehojwyahux", model.loadBalancerResourceId());
        Assertions.assertEquals(1511051439, model.probePort());
        Assertions.assertEquals("njaqwixjspro", model.sqlVirtualMachineInstances().get(0));
    }
}