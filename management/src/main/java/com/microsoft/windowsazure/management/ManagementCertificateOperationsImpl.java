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

package com.microsoft.windowsazure.management;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.core.pipeline.apache.CustomHttpDelete;
import com.microsoft.windowsazure.core.utils.BOMInputStream;
import com.microsoft.windowsazure.core.utils.Base64;
import com.microsoft.windowsazure.core.utils.XmlUtility;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.models.ManagementCertificateCreateParameters;
import com.microsoft.windowsazure.management.models.ManagementCertificateGetResponse;
import com.microsoft.windowsazure.management.models.ManagementCertificateListResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
* You can use management certificates, which are also known as subscription
* certificates, to authenticate clients attempting to connect to resources
* associated with your Azure subscription.  (see
* http://msdn.microsoft.com/en-us/library/windowsazure/jj154124.aspx for more
* information)
*/
public class ManagementCertificateOperationsImpl implements ServiceOperations<ManagementClientImpl>, ManagementCertificateOperations {
    /**
    * Initializes a new instance of the ManagementCertificateOperationsImpl
    * class.
    *
    * @param client Reference to the service client.
    */
    ManagementCertificateOperationsImpl(ManagementClientImpl client) {
        this.client = client;
    }
    
    private ManagementClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.ManagementClientImpl.
    * @return The Client value.
    */
    public ManagementClientImpl getClient() {
        return this.client;
    }
    
    /**
    * The Create Management Certificate operation adds a certificate to the
    * list of management certificates. Management certificates, which are also
    * known as subscription certificates, authenticate clients attempting to
    * connect to resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154123.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Create Management
    * Certificate operation.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> createAsync(final ManagementCertificateCreateParameters parameters) {
        return this.getClient().getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception {
                return create(parameters);
            }
         });
    }
    
    /**
    * The Create Management Certificate operation adds a certificate to the
    * list of management certificates. Management certificates, which are also
    * known as subscription certificates, authenticate clients attempting to
    * connect to resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154123.aspx for
    * more information)
    *
    * @param parameters Required. Parameters supplied to the Create Management
    * Certificate operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse create(ManagementCertificateCreateParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException {
        // Validate
        if (parameters == null) {
            throw new NullPointerException("parameters");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("parameters", parameters);
            CloudTracing.enter(invocationId, this, "createAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/certificates";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpPost httpRequest = new HttpPost(url);
        
        // Set Headers
        httpRequest.setHeader("Content-Type", "application/xml");
        httpRequest.setHeader("x-ms-version", "2014-10-01");
        
        // Serialize Request
        String requestContent = null;
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document requestDoc = documentBuilder.newDocument();
        
        Element subscriptionCertificateElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SubscriptionCertificate");
        requestDoc.appendChild(subscriptionCertificateElement);
        
        if (parameters.getPublicKey() != null) {
            Element subscriptionCertificatePublicKeyElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SubscriptionCertificatePublicKey");
            subscriptionCertificatePublicKeyElement.appendChild(requestDoc.createTextNode(Base64.encode(parameters.getPublicKey())));
            subscriptionCertificateElement.appendChild(subscriptionCertificatePublicKeyElement);
        }
        
        if (parameters.getThumbprint() != null) {
            Element subscriptionCertificateThumbprintElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateThumbprint");
            subscriptionCertificateThumbprintElement.appendChild(requestDoc.createTextNode(parameters.getThumbprint()));
            subscriptionCertificateElement.appendChild(subscriptionCertificateThumbprintElement);
        }
        
        if (parameters.getData() != null) {
            Element subscriptionCertificateDataElement = requestDoc.createElementNS("http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateData");
            subscriptionCertificateDataElement.appendChild(requestDoc.createTextNode(Base64.encode(parameters.getData())));
            subscriptionCertificateElement.appendChild(subscriptionCertificateDataElement);
        }
        
        DOMSource domSource = new DOMSource(requestDoc);
        StringWriter stringWriter = new StringWriter();
        StreamResult streamResult = new StreamResult(stringWriter);
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.transform(domSource, streamResult);
        requestContent = stringWriter.toString();
        StringEntity entity = new StringEntity(requestContent);
        httpRequest.setEntity(entity);
        httpRequest.setHeader("Content-Type", "application/xml");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, requestContent, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationResponse result = null;
            result = new OperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * The Delete Management Certificate operation deletes a certificate from
    * the list of management certificates. Management certificates, which are
    * also known as subscription certificates, authenticate clients attempting
    * to connect to resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154127.aspx for
    * more information)
    *
    * @param thumbprint Required. The thumbprint value of the certificate to
    * delete.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public Future<OperationResponse> deleteAsync(final String thumbprint) {
        return this.getClient().getExecutorService().submit(new Callable<OperationResponse>() { 
            @Override
            public OperationResponse call() throws Exception {
                return delete(thumbprint);
            }
         });
    }
    
    /**
    * The Delete Management Certificate operation deletes a certificate from
    * the list of management certificates. Management certificates, which are
    * also known as subscription certificates, authenticate clients attempting
    * to connect to resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154127.aspx for
    * more information)
    *
    * @param thumbprint Required. The thumbprint value of the certificate to
    * delete.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    @Override
    public OperationResponse delete(String thumbprint) throws IOException, ServiceException {
        // Validate
        if (thumbprint == null) {
            throw new NullPointerException("thumbprint");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("thumbprint", thumbprint);
            CloudTracing.enter(invocationId, this, "deleteAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/certificates/" + thumbprint.trim();
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        CustomHttpDelete httpRequest = new CustomHttpDelete(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK && statusCode != HttpStatus.SC_NOT_FOUND) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            OperationResponse result = null;
            result = new OperationResponse();
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * The Get Management Certificate operation retrieves information about the
    * management certificate with the specified thumbprint. Management
    * certificates, which are also known as subscription certificates,
    * authenticate clients attempting to connect to resources associated with
    * your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154131.aspx for
    * more information)
    *
    * @param thumbprint Required. The thumbprint value of the certificate to
    * retrieve information about.
    * @return The Get Management Certificate operation response.
    */
    @Override
    public Future<ManagementCertificateGetResponse> getAsync(final String thumbprint) {
        return this.getClient().getExecutorService().submit(new Callable<ManagementCertificateGetResponse>() { 
            @Override
            public ManagementCertificateGetResponse call() throws Exception {
                return get(thumbprint);
            }
         });
    }
    
    /**
    * The Get Management Certificate operation retrieves information about the
    * management certificate with the specified thumbprint. Management
    * certificates, which are also known as subscription certificates,
    * authenticate clients attempting to connect to resources associated with
    * your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154131.aspx for
    * more information)
    *
    * @param thumbprint Required. The thumbprint value of the certificate to
    * retrieve information about.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Management Certificate operation response.
    */
    @Override
    public ManagementCertificateGetResponse get(String thumbprint) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException {
        // Validate
        if (thumbprint == null) {
            throw new NullPointerException("thumbprint");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("thumbprint", thumbprint);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/certificates/" + thumbprint.trim();
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            ManagementCertificateGetResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new ManagementCertificateGetResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
            
            Element subscriptionCertificateElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificate");
            if (subscriptionCertificateElement != null) {
                Element subscriptionCertificatePublicKeyElement = XmlUtility.getElementByTagNameNS(subscriptionCertificateElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificatePublicKey");
                if (subscriptionCertificatePublicKeyElement != null) {
                    byte[] subscriptionCertificatePublicKeyInstance;
                    subscriptionCertificatePublicKeyInstance = subscriptionCertificatePublicKeyElement.getTextContent() != null ? Base64.decode(subscriptionCertificatePublicKeyElement.getTextContent()) : null;
                    result.setPublicKey(subscriptionCertificatePublicKeyInstance);
                }
                
                Element subscriptionCertificateThumbprintElement = XmlUtility.getElementByTagNameNS(subscriptionCertificateElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateThumbprint");
                if (subscriptionCertificateThumbprintElement != null) {
                    String subscriptionCertificateThumbprintInstance;
                    subscriptionCertificateThumbprintInstance = subscriptionCertificateThumbprintElement.getTextContent();
                    result.setThumbprint(subscriptionCertificateThumbprintInstance);
                }
                
                Element subscriptionCertificateDataElement = XmlUtility.getElementByTagNameNS(subscriptionCertificateElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateData");
                if (subscriptionCertificateDataElement != null) {
                    byte[] subscriptionCertificateDataInstance;
                    subscriptionCertificateDataInstance = subscriptionCertificateDataElement.getTextContent() != null ? Base64.decode(subscriptionCertificateDataElement.getTextContent()) : null;
                    result.setData(subscriptionCertificateDataInstance);
                }
                
                Element createdElement = XmlUtility.getElementByTagNameNS(subscriptionCertificateElement, "http://schemas.microsoft.com/windowsazure", "Created");
                if (createdElement != null) {
                    Calendar createdInstance;
                    createdInstance = DatatypeConverter.parseDateTime(createdElement.getTextContent());
                    result.setCreated(createdInstance);
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
    
    /**
    * The List Management Certificates operation lists and returns basic
    * information about all of the management certificates associated with the
    * specified subscription. Management certificates, which are also known as
    * subscription certificates, authenticate clients attempting to connect to
    * resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154105.aspx for
    * more information)
    *
    * @return The List Management Certificates operation response.
    */
    @Override
    public Future<ManagementCertificateListResponse> listAsync() {
        return this.getClient().getExecutorService().submit(new Callable<ManagementCertificateListResponse>() { 
            @Override
            public ManagementCertificateListResponse call() throws Exception {
                return list();
            }
         });
    }
    
    /**
    * The List Management Certificates operation lists and returns basic
    * information about all of the management certificates associated with the
    * specified subscription. Management certificates, which are also known as
    * subscription certificates, authenticate clients attempting to connect to
    * resources associated with your Azure subscription.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/jj154105.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Management Certificates operation response.
    */
    @Override
    public ManagementCertificateListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace) {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listAsync", tracingParameters);
        }
        
        // Construct URL
        String url = "/" + (this.getClient().getCredentials().getSubscriptionId() != null ? this.getClient().getCredentials().getSubscriptionId().trim() : "") + "/certificates";
        String baseUrl = this.getClient().getBaseUri().toString();
        // Trim '/' character from the end of baseUrl and beginning of url.
        if (baseUrl.charAt(baseUrl.length() - 1) == '/') {
            baseUrl = baseUrl.substring(0, (baseUrl.length() - 1) + 0);
        }
        if (url.charAt(0) == '/') {
            url = url.substring(1);
        }
        url = baseUrl + "/" + url;
        url = url.replace(" ", "%20");
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("x-ms-version", "2014-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        try {
            if (shouldTrace) {
                CloudTracing.sendRequest(invocationId, httpRequest);
            }
            httpResponse = this.getClient().getHttpClient().execute(httpRequest);
            if (shouldTrace) {
                CloudTracing.receiveResponse(invocationId, httpResponse);
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                ServiceException ex = ServiceException.createFromXml(httpRequest, null, httpResponse, httpResponse.getEntity());
                if (shouldTrace) {
                    CloudTracing.error(invocationId, ex);
                }
                throw ex;
            }
            
            // Create Result
            ManagementCertificateListResponse result = null;
            // Deserialize Response
            InputStream responseContent = httpResponse.getEntity().getContent();
            result = new ManagementCertificateListResponse();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            documentBuilderFactory.setNamespaceAware(true);
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document responseDoc = documentBuilder.parse(new BOMInputStream(responseContent));
            
            Element subscriptionCertificatesSequenceElement = XmlUtility.getElementByTagNameNS(responseDoc, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificates");
            if (subscriptionCertificatesSequenceElement != null) {
                for (int i1 = 0; i1 < com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(subscriptionCertificatesSequenceElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificate").size(); i1 = i1 + 1) {
                    org.w3c.dom.Element subscriptionCertificatesElement = ((org.w3c.dom.Element) com.microsoft.windowsazure.core.utils.XmlUtility.getElementsByTagNameNS(subscriptionCertificatesSequenceElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificate").get(i1));
                    ManagementCertificateListResponse.SubscriptionCertificate subscriptionCertificateInstance = new ManagementCertificateListResponse.SubscriptionCertificate();
                    result.getSubscriptionCertificates().add(subscriptionCertificateInstance);
                    
                    Element subscriptionCertificatePublicKeyElement = XmlUtility.getElementByTagNameNS(subscriptionCertificatesElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificatePublicKey");
                    if (subscriptionCertificatePublicKeyElement != null) {
                        byte[] subscriptionCertificatePublicKeyInstance;
                        subscriptionCertificatePublicKeyInstance = subscriptionCertificatePublicKeyElement.getTextContent() != null ? Base64.decode(subscriptionCertificatePublicKeyElement.getTextContent()) : null;
                        subscriptionCertificateInstance.setPublicKey(subscriptionCertificatePublicKeyInstance);
                    }
                    
                    Element subscriptionCertificateThumbprintElement = XmlUtility.getElementByTagNameNS(subscriptionCertificatesElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateThumbprint");
                    if (subscriptionCertificateThumbprintElement != null) {
                        String subscriptionCertificateThumbprintInstance;
                        subscriptionCertificateThumbprintInstance = subscriptionCertificateThumbprintElement.getTextContent();
                        subscriptionCertificateInstance.setThumbprint(subscriptionCertificateThumbprintInstance);
                    }
                    
                    Element subscriptionCertificateDataElement = XmlUtility.getElementByTagNameNS(subscriptionCertificatesElement, "http://schemas.microsoft.com/windowsazure", "SubscriptionCertificateData");
                    if (subscriptionCertificateDataElement != null) {
                        byte[] subscriptionCertificateDataInstance;
                        subscriptionCertificateDataInstance = subscriptionCertificateDataElement.getTextContent() != null ? Base64.decode(subscriptionCertificateDataElement.getTextContent()) : null;
                        subscriptionCertificateInstance.setData(subscriptionCertificateDataInstance);
                    }
                    
                    Element createdElement = XmlUtility.getElementByTagNameNS(subscriptionCertificatesElement, "http://schemas.microsoft.com/windowsazure", "Created");
                    if (createdElement != null) {
                        Calendar createdInstance;
                        createdInstance = DatatypeConverter.parseDateTime(createdElement.getTextContent());
                        subscriptionCertificateInstance.setCreated(createdInstance);
                    }
                }
            }
            
            result.setStatusCode(statusCode);
            if (httpResponse.getHeaders("x-ms-request-id").length > 0) {
                result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
            }
            
            if (shouldTrace) {
                CloudTracing.exit(invocationId, result);
            }
            return result;
        } finally {
            if (httpResponse != null && httpResponse.getEntity() != null) {
                httpResponse.getEntity().getContent().close();
            }
        }
    }
}
