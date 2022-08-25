// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.fluent.ProjectEnvironmentTypesClient;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectEnvironmentTypeInner;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypes;

public final class ProjectEnvironmentTypesImpl implements ProjectEnvironmentTypes {
    private static final ClientLogger LOGGER = new ClientLogger(ProjectEnvironmentTypesImpl.class);

    private final ProjectEnvironmentTypesClient innerClient;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public ProjectEnvironmentTypesImpl(
        ProjectEnvironmentTypesClient innerClient,
        com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProjectEnvironmentType> list(String resourceGroupName, String projectName) {
        PagedIterable<ProjectEnvironmentTypeInner> inner = this.serviceClient().list(resourceGroupName, projectName);
        return Utils.mapPage(inner, inner1 -> new ProjectEnvironmentTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<ProjectEnvironmentType> list(
        String resourceGroupName, String projectName, Integer top, Context context) {
        PagedIterable<ProjectEnvironmentTypeInner> inner =
            this.serviceClient().list(resourceGroupName, projectName, top, context);
        return Utils.mapPage(inner, inner1 -> new ProjectEnvironmentTypeImpl(inner1, this.manager()));
    }

    public ProjectEnvironmentType get(String resourceGroupName, String projectName, String environmentTypeName) {
        ProjectEnvironmentTypeInner inner =
            this.serviceClient().get(resourceGroupName, projectName, environmentTypeName);
        if (inner != null) {
            return new ProjectEnvironmentTypeImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProjectEnvironmentType> getWithResponse(
        String resourceGroupName, String projectName, String environmentTypeName, Context context) {
        Response<ProjectEnvironmentTypeInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, projectName, environmentTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectEnvironmentTypeImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String projectName, String environmentTypeName) {
        this.serviceClient().delete(resourceGroupName, projectName, environmentTypeName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String projectName, String environmentTypeName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, projectName, environmentTypeName, context);
    }

    public ProjectEnvironmentType getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String environmentTypeName = Utils.getValueFromIdByName(id, "environmentTypes");
        if (environmentTypeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'environmentTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, environmentTypeName, Context.NONE).getValue();
    }

    public Response<ProjectEnvironmentType> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String environmentTypeName = Utils.getValueFromIdByName(id, "environmentTypes");
        if (environmentTypeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'environmentTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, projectName, environmentTypeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String environmentTypeName = Utils.getValueFromIdByName(id, "environmentTypes");
        if (environmentTypeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'environmentTypes'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, projectName, environmentTypeName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        String environmentTypeName = Utils.getValueFromIdByName(id, "environmentTypes");
        if (environmentTypeName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'environmentTypes'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, projectName, environmentTypeName, context);
    }

    private ProjectEnvironmentTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    public ProjectEnvironmentTypeImpl define(String name) {
        return new ProjectEnvironmentTypeImpl(name, this.manager());
    }
}