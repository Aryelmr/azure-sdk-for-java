// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VersionState. */
public final class VersionState extends ExpandableStringEnum<VersionState> {
    /** Static value Unknown for VersionState. */
    public static final VersionState UNKNOWN = fromString("Unknown");

    /** Static value Preview for VersionState. */
    public static final VersionState PREVIEW = fromString("Preview");

    /** Static value Validating for VersionState. */
    public static final VersionState VALIDATING = fromString("Validating");

    /** Static value ValidationFailed for VersionState. */
    public static final VersionState VALIDATION_FAILED = fromString("ValidationFailed");

    /** Static value Active for VersionState. */
    public static final VersionState ACTIVE = fromString("Active");

    /** Static value Deprecated for VersionState. */
    public static final VersionState DEPRECATED = fromString("Deprecated");

    /**
     * Creates or finds a VersionState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VersionState.
     */
    @JsonCreator
    public static VersionState fromString(String name) {
        return fromString(name, VersionState.class);
    }

    /**
     * Gets known VersionState values.
     *
     * @return known VersionState values.
     */
    public static Collection<VersionState> values() {
        return values(VersionState.class);
    }
}