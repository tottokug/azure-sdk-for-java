/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;

/**
* The Get Data Disk operation response.
*/
public class VirtualMachineDataDiskGetResponse extends OperationResponse {
    private String hostCaching;
    
    /**
    * Optional. The current value of the platform caching behavior of data disk
    * blob for read/write efficiency. Possible values are: None, ReadOnly, or
    * ReadWrite.
    * @return The HostCaching value.
    */
    public String getHostCaching() {
        return this.hostCaching;
    }
    
    /**
    * Optional. The current value of the platform caching behavior of data disk
    * blob for read/write efficiency. Possible values are: None, ReadOnly, or
    * ReadWrite.
    * @param hostCachingValue The HostCaching value.
    */
    public void setHostCaching(final String hostCachingValue) {
        this.hostCaching = hostCachingValue;
    }
    
    private String iOType;
    
    /**
    * Optional. Gets or sets the IO type.
    * @return The IOType value.
    */
    public String getIOType() {
        return this.iOType;
    }
    
    /**
    * Optional. Gets or sets the IO type.
    * @param iOTypeValue The IOType value.
    */
    public void setIOType(final String iOTypeValue) {
        this.iOType = iOTypeValue;
    }
    
    private String label;
    
    /**
    * Optional. The description of the data disk.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. The description of the data disk.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private int logicalDiskSizeInGB;
    
    /**
    * Optional. The size, in GB, of the data disk.
    * @return The LogicalDiskSizeInGB value.
    */
    public int getLogicalDiskSizeInGB() {
        return this.logicalDiskSizeInGB;
    }
    
    /**
    * Optional. The size, in GB, of the data disk.
    * @param logicalDiskSizeInGBValue The LogicalDiskSizeInGB value.
    */
    public void setLogicalDiskSizeInGB(final int logicalDiskSizeInGBValue) {
        this.logicalDiskSizeInGB = logicalDiskSizeInGBValue;
    }
    
    private Integer logicalUnitNumber;
    
    /**
    * Optional. The Logical Unit Number (LUN) for the disk. The LUN specifies
    * the slot in which the data drive appears when mounted for usage by the
    * virtual machine.
    * @return The LogicalUnitNumber value.
    */
    public Integer getLogicalUnitNumber() {
        return this.logicalUnitNumber;
    }
    
    /**
    * Optional. The Logical Unit Number (LUN) for the disk. The LUN specifies
    * the slot in which the data drive appears when mounted for usage by the
    * virtual machine.
    * @param logicalUnitNumberValue The LogicalUnitNumber value.
    */
    public void setLogicalUnitNumber(final Integer logicalUnitNumberValue) {
        this.logicalUnitNumber = logicalUnitNumberValue;
    }
    
    private URI mediaLinkUri;
    
    /**
    * Optional. The location of the physical blob backing the data disk. The
    * blob location is in the storage account in the subscription specified by
    * the SubscriptionId value in the operation call.
    * @return The MediaLinkUri value.
    */
    public URI getMediaLinkUri() {
        return this.mediaLinkUri;
    }
    
    /**
    * Optional. The location of the physical blob backing the data disk. The
    * blob location is in the storage account in the subscription specified by
    * the SubscriptionId value in the operation call.
    * @param mediaLinkUriValue The MediaLinkUri value.
    */
    public void setMediaLinkUri(final URI mediaLinkUriValue) {
        this.mediaLinkUri = mediaLinkUriValue;
    }
    
    private String name;
    
    /**
    * Optional. The name of the data disk.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. The name of the data disk.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
}
