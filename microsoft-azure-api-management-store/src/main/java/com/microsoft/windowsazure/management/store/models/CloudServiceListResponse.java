// 
// Copyright (c) Microsoft and contributors.  All rights reserved.
// 
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//   http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// 
// See the License for the specific language governing permissions and
// limitations under the License.
// 

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.store.models;

import com.microsoft.windowsazure.management.OperationResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
* The response structure for the Cloud Service List operation
*/
public class CloudServiceListResponse extends OperationResponse implements Iterable<CloudServiceListResponse.CloudService>
{
    private ArrayList<CloudServiceListResponse.CloudService> cloudServices;
    
    /**
    * The list of cloud service locations for this subscription.
    */
    public ArrayList<CloudServiceListResponse.CloudService> getCloudServices() { return this.cloudServices; }
    
    /**
    * The list of cloud service locations for this subscription.
    */
    public void setCloudServices(ArrayList<CloudServiceListResponse.CloudService> cloudServices) { this.cloudServices = cloudServices; }
    
    /**
    * Initializes a new instance of the CloudServiceListResponse class.
    *
    */
    public CloudServiceListResponse()
    {
        this.cloudServices = new ArrayList<CloudServiceListResponse.CloudService>();
    }
    
    /**
    * Gets the sequence of CloudServices.
    *
    */
    public Iterator<CloudServiceListResponse.CloudService> iterator()
    {
        return this.getCloudServices().iterator();
    }
    
    /**
    * Defines a cloud service-supporting region in which a storm item is
    * located.
    */
    public static class CloudService
    {
        private String description;
        
        /**
        * The description of the cloud service region.
        */
        public String getDescription() { return this.description; }
        
        /**
        * The description of the cloud service region.
        */
        public void setDescription(String description) { this.description = description; }
        
        private String geoRegion;
        
        /**
        * The geographical region in which this cloud service can run.
        */
        public String getGeoRegion() { return this.geoRegion; }
        
        /**
        * The geographical region in which this cloud service can run.
        */
        public void setGeoRegion(String geoRegion) { this.geoRegion = geoRegion; }
        
        private String label;
        
        /**
        * The label of the cloud service region.
        */
        public String getLabel() { return this.label; }
        
        /**
        * The label of the cloud service region.
        */
        public void setLabel(String label) { this.label = label; }
        
        private String name;
        
        /**
        * The name of the cloud service region.
        */
        public String getName() { return this.name; }
        
        /**
        * The name of the cloud service region.
        */
        public void setName(String name) { this.name = name; }
        
        private ArrayList<CloudServiceListResponse.CloudService.AddOnResource> resources;
        
        /**
        * A list of existing store resources installed into a cloud service
        * region.
        */
        public ArrayList<CloudServiceListResponse.CloudService.AddOnResource> getResources() { return this.resources; }
        
        /**
        * A list of existing store resources installed into a cloud service
        * region.
        */
        public void setResources(ArrayList<CloudServiceListResponse.CloudService.AddOnResource> resources) { this.resources = resources; }
        
        /**
        * Initializes a new instance of the CloudService class.
        *
        */
        public CloudService()
        {
            this.resources = new ArrayList<CloudServiceListResponse.CloudService.AddOnResource>();
        }
        
        /**
        * A store add-on item.
        */
        public static class AddOnResource
        {
            private String eTag;
            
            /**
            * The ETag for this store resource.
            */
            public String getETag() { return this.eTag; }
            
            /**
            * The ETag for this store resource.
            */
            public void setETag(String eTag) { this.eTag = eTag; }
            
            private String name;
            
            /**
            * The user-input name of this store item.
            */
            public String getName() { return this.name; }
            
            /**
            * The user-input name of this store item.
            */
            public void setName(String name) { this.name = name; }
            
            private String namespace;
            
            /**
            * The namespace in which this store item resides.
            */
            public String getNamespace() { return this.namespace; }
            
            /**
            * The namespace in which this store item resides.
            */
            public void setNamespace(String namespace) { this.namespace = namespace; }
            
            private HashMap<String, String> outputItems;
            
            /**
            * Output items associated with an individual store resource.
            */
            public HashMap<String, String> getOutputItems() { return this.outputItems; }
            
            /**
            * Output items associated with an individual store resource.
            */
            public void setOutputItems(HashMap<String, String> outputItems) { this.outputItems = outputItems; }
            
            private String plan;
            
            /**
            * The plan for this store item as selected by the user.
            */
            public String getPlan() { return this.plan; }
            
            /**
            * The plan for this store item as selected by the user.
            */
            public void setPlan(String plan) { this.plan = plan; }
            
            private String schemaVersion;
            
            /**
            * The schema version for this resource.
            */
            public String getSchemaVersion() { return this.schemaVersion; }
            
            /**
            * The schema version for this resource.
            */
            public void setSchemaVersion(String schemaVersion) { this.schemaVersion = schemaVersion; }
            
            private String state;
            
            /**
            * The state of this store resource.
            */
            public String getState() { return this.state; }
            
            /**
            * The state of this store resource.
            */
            public void setState(String state) { this.state = state; }
            
            private CloudServiceListResponse.CloudService.AddOnResource.OperationStatus status;
            
            /**
            * Operation status items associated with an individual store
            * resource.
            */
            public CloudServiceListResponse.CloudService.AddOnResource.OperationStatus getStatus() { return this.status; }
            
            /**
            * Operation status items associated with an individual store
            * resource.
            */
            public void setStatus(CloudServiceListResponse.CloudService.AddOnResource.OperationStatus status) { this.status = status; }
            
            private String type;
            
            /**
            * The type of store item.
            */
            public String getType() { return this.type; }
            
            /**
            * The type of store item.
            */
            public void setType(String type) { this.type = type; }
            
            private ArrayList<CloudServiceListResponse.CloudService.AddOnResource.UsageLimit> usageLimits;
            
            /**
            * Usage meters associated with an individual store resource.
            */
            public ArrayList<CloudServiceListResponse.CloudService.AddOnResource.UsageLimit> getUsageLimits() { return this.usageLimits; }
            
            /**
            * Usage meters associated with an individual store resource.
            */
            public void setUsageLimits(ArrayList<CloudServiceListResponse.CloudService.AddOnResource.UsageLimit> usageLimits) { this.usageLimits = usageLimits; }
            
            /**
            * Initializes a new instance of the AddOnResource class.
            *
            */
            public AddOnResource()
            {
                this.outputItems = new HashMap<String, String>();
                this.usageLimits = new ArrayList<CloudServiceListResponse.CloudService.AddOnResource.UsageLimit>();
            }
            
            /**
            * The operation status of an individual store resource item.
            */
            public static class OperationStatus
            {
                private String result;
                
                /**
                * The result of this operation status.
                */
                public String getResult() { return this.result; }
                
                /**
                * The result of this operation status.
                */
                public void setResult(String result) { this.result = result; }
                
                private String type;
                
                /**
                * The type of this operation status.
                */
                public String getType() { return this.type; }
                
                /**
                * The type of this operation status.
                */
                public void setType(String type) { this.type = type; }
                
                /**
                * Initializes a new instance of the OperationStatus class.
                *
                */
                public OperationStatus()
                {
                }
            }
            
            /**
            * Describes the current utilization and metering of a store
            * resource item.
            */
            public static class UsageLimit
            {
                private long amountIncluded;
                
                /**
                * Defines the limit of this usage included in this store
                * resource's plan.
                */
                public long getAmountIncluded() { return this.amountIncluded; }
                
                /**
                * Defines the limit of this usage included in this store
                * resource's plan.
                */
                public void setAmountIncluded(long amountIncluded) { this.amountIncluded = amountIncluded; }
                
                private long amountUsed;
                
                /**
                * The amount of this store resource that has already been used.
                */
                public long getAmountUsed() { return this.amountUsed; }
                
                /**
                * The amount of this store resource that has already been used.
                */
                public void setAmountUsed(long amountUsed) { this.amountUsed = amountUsed; }
                
                private String name;
                
                /**
                * The name of this usage limit.
                */
                public String getName() { return this.name; }
                
                /**
                * The name of this usage limit.
                */
                public void setName(String name) { this.name = name; }
                
                private String unit;
                
                /**
                * The unit in which this usage limit is measured.
                */
                public String getUnit() { return this.unit; }
                
                /**
                * The unit in which this usage limit is measured.
                */
                public void setUnit(String unit) { this.unit = unit; }
                
                /**
                * Initializes a new instance of the UsageLimit class.
                *
                */
                public UsageLimit()
                {
                }
            }
        }
    }
}