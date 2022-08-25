// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Represents an image version. */
@Fluent
public final class ImageVersionInner extends ProxyResource {
    /*
     * Image version properties.
     */
    @JsonProperty(value = "properties")
    private ImageVersionProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Image version properties.
     *
     * @return the innerProperties value.
     */
    private ImageVersionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the name property: The semantic version string.
     *
     * @return the name value.
     */
    public String namePropertiesName() {
        return this.innerProperties() == null ? null : this.innerProperties().name();
    }

    /**
     * Get the publishedDate property: The datetime that the backing image version was published.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().publishedDate();
    }

    /**
     * Get the excludeFromLatest property: If the version should be excluded from being treated as the latest version.
     *
     * @return the excludeFromLatest value.
     */
    public Boolean excludeFromLatest() {
        return this.innerProperties() == null ? null : this.innerProperties().excludeFromLatest();
    }

    /**
     * Get the osDiskImageSizeInGb property: The size of the OS disk image, in GB.
     *
     * @return the osDiskImageSizeInGb value.
     */
    public Integer osDiskImageSizeInGb() {
        return this.innerProperties() == null ? null : this.innerProperties().osDiskImageSizeInGb();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}