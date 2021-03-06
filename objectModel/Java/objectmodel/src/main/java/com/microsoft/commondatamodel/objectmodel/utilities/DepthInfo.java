// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

package com.microsoft.commondatamodel.objectmodel.utilities;

public class DepthInfo {
    /**
     * The default depth that we travel before forcing a foreign key attribute
     */
    public static int defaultMaxDepth = 2;

    /**
     * The max depth set if the user specified to not use max depth
     */
    public static int maxDepthLimit = 32;

    /**
     * The maximum depth that we can resolve entity attributes.
     * This value is set in resolution guidance.
     */
    private Integer maxDepth;
    /**
     * The current depth that we are resolving at. Each entity attribute that we resolve
     * into adds 1 to depth.
     */
    private int currentDepth;
    /**
     * Indicates if the maxDepth value has been hit when resolving
     */
    private boolean maxDepthExceeded;

    public Integer getMaxDepth() {
        return this.maxDepth;
    }

    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int getCurrentDepth() {
        return this.currentDepth;
    }

    public void setCurrentDepth(int currentDepth) {
        this.currentDepth = currentDepth;
    }

    public boolean getMaxDepthExceeded() {
        return this.maxDepthExceeded;
    }

    public void setMaxDepthExceeded(boolean maxDepthExceeded) {
        this.maxDepthExceeded = maxDepthExceeded;
    }
}
