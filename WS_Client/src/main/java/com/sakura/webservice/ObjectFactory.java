
package com.sakura.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sakura.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddState_QNAME = new QName("http://webservice.sakura.com/", "addState");
    private final static QName _AddStateResponse_QNAME = new QName("http://webservice.sakura.com/", "addStateResponse");
    private final static QName _DeleteState_QNAME = new QName("http://webservice.sakura.com/", "deleteState");
    private final static QName _DeleteStateResponse_QNAME = new QName("http://webservice.sakura.com/", "deleteStateResponse");
    private final static QName _FindAllList_QNAME = new QName("http://webservice.sakura.com/", "findAllList");
    private final static QName _FindAllListResponse_QNAME = new QName("http://webservice.sakura.com/", "findAllListResponse");
    private final static QName _FindStateByKind_QNAME = new QName("http://webservice.sakura.com/", "findStateByKind");
    private final static QName _FindStateByKindResponse_QNAME = new QName("http://webservice.sakura.com/", "findStateByKindResponse");
    private final static QName _FindStateByName_QNAME = new QName("http://webservice.sakura.com/", "findStateByName");
    private final static QName _FindStateByNameResponse_QNAME = new QName("http://webservice.sakura.com/", "findStateByNameResponse");
    private final static QName _UpdateState_QNAME = new QName("http://webservice.sakura.com/", "updateState");
    private final static QName _UpdateStateResponse_QNAME = new QName("http://webservice.sakura.com/", "updateStateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sakura.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddState }
     * 
     */
    public AddState createAddState() {
        return new AddState();
    }

    /**
     * Create an instance of {@link AddStateResponse }
     * 
     */
    public AddStateResponse createAddStateResponse() {
        return new AddStateResponse();
    }

    /**
     * Create an instance of {@link DeleteState }
     * 
     */
    public DeleteState createDeleteState() {
        return new DeleteState();
    }

    /**
     * Create an instance of {@link DeleteStateResponse }
     * 
     */
    public DeleteStateResponse createDeleteStateResponse() {
        return new DeleteStateResponse();
    }

    /**
     * Create an instance of {@link FindAllList }
     * 
     */
    public FindAllList createFindAllList() {
        return new FindAllList();
    }

    /**
     * Create an instance of {@link FindAllListResponse }
     * 
     */
    public FindAllListResponse createFindAllListResponse() {
        return new FindAllListResponse();
    }

    /**
     * Create an instance of {@link FindStateByKind }
     * 
     */
    public FindStateByKind createFindStateByKind() {
        return new FindStateByKind();
    }

    /**
     * Create an instance of {@link FindStateByKindResponse }
     * 
     */
    public FindStateByKindResponse createFindStateByKindResponse() {
        return new FindStateByKindResponse();
    }

    /**
     * Create an instance of {@link FindStateByName }
     * 
     */
    public FindStateByName createFindStateByName() {
        return new FindStateByName();
    }

    /**
     * Create an instance of {@link FindStateByNameResponse }
     * 
     */
    public FindStateByNameResponse createFindStateByNameResponse() {
        return new FindStateByNameResponse();
    }

    /**
     * Create an instance of {@link UpdateState }
     * 
     */
    public UpdateState createUpdateState() {
        return new UpdateState();
    }

    /**
     * Create an instance of {@link UpdateStateResponse }
     * 
     */
    public UpdateStateResponse createUpdateStateResponse() {
        return new UpdateStateResponse();
    }

    /**
     * Create an instance of {@link State }
     * 
     */
    public State createState() {
        return new State();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "addState")
    public JAXBElement<AddState> createAddState(AddState value) {
        return new JAXBElement<AddState>(_AddState_QNAME, AddState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "addStateResponse")
    public JAXBElement<AddStateResponse> createAddStateResponse(AddStateResponse value) {
        return new JAXBElement<AddStateResponse>(_AddStateResponse_QNAME, AddStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "deleteState")
    public JAXBElement<DeleteState> createDeleteState(DeleteState value) {
        return new JAXBElement<DeleteState>(_DeleteState_QNAME, DeleteState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "deleteStateResponse")
    public JAXBElement<DeleteStateResponse> createDeleteStateResponse(DeleteStateResponse value) {
        return new JAXBElement<DeleteStateResponse>(_DeleteStateResponse_QNAME, DeleteStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findAllList")
    public JAXBElement<FindAllList> createFindAllList(FindAllList value) {
        return new JAXBElement<FindAllList>(_FindAllList_QNAME, FindAllList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findAllListResponse")
    public JAXBElement<FindAllListResponse> createFindAllListResponse(FindAllListResponse value) {
        return new JAXBElement<FindAllListResponse>(_FindAllListResponse_QNAME, FindAllListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStateByKind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findStateByKind")
    public JAXBElement<FindStateByKind> createFindStateByKind(FindStateByKind value) {
        return new JAXBElement<FindStateByKind>(_FindStateByKind_QNAME, FindStateByKind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStateByKindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findStateByKindResponse")
    public JAXBElement<FindStateByKindResponse> createFindStateByKindResponse(FindStateByKindResponse value) {
        return new JAXBElement<FindStateByKindResponse>(_FindStateByKindResponse_QNAME, FindStateByKindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStateByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findStateByName")
    public JAXBElement<FindStateByName> createFindStateByName(FindStateByName value) {
        return new JAXBElement<FindStateByName>(_FindStateByName_QNAME, FindStateByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStateByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "findStateByNameResponse")
    public JAXBElement<FindStateByNameResponse> createFindStateByNameResponse(FindStateByNameResponse value) {
        return new JAXBElement<FindStateByNameResponse>(_FindStateByNameResponse_QNAME, FindStateByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "updateState")
    public JAXBElement<UpdateState> createUpdateState(UpdateState value) {
        return new JAXBElement<UpdateState>(_UpdateState_QNAME, UpdateState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.sakura.com/", name = "updateStateResponse")
    public JAXBElement<UpdateStateResponse> createUpdateStateResponse(UpdateStateResponse value) {
        return new JAXBElement<UpdateStateResponse>(_UpdateStateResponse_QNAME, UpdateStateResponse.class, null, value);
    }

}
