<%@ include file="/WEB-INF/jsp/includes/taglibs.jsp" %>

<commons:popupHeader />

    <div id="main-body-header">
        <fmt:message key="console.directory.department.create.label.title"/>
    </div>

    <div id="main-body-content">
        <form:form id="createDept" action="${pageContext.request.contextPath}/web/console/directory/dept/submit/create?orgId=${organization.id}&parentId=${parent.id}" method="POST" modelAttribute="department" cssClass="form blockui">
            <form:errors path="*" cssClass="form-errors"/>
            <c:if test="${!empty errors}">
                <span class="form-errors" style="display:block">
                    <c:forEach items="${errors}" var="error">
                        <fmt:message key="${error}"/>
                    </c:forEach>
                </span>
            </c:if>
            <fieldset>
                <legend><fmt:message key="console.directory.department.common.label.details"/></legend>
                <div class="form-row">
                    <label for="field1"><fmt:message key="console.directory.department.common.label.id"/> <span class="mandatory">*</span></label>
                    <span class="form-input"><form:input path="id" cssErrorClass="form-input-error" /></span>
                </div>
                <div class="form-row">
                    <label for="field1"><fmt:message key="console.directory.department.common.label.name"/> <span class="mandatory">*</span></label>
                    <span class="form-input"><form:input path="name" cssErrorClass="form-input-error" /></span>
                </div>
                <div class="form-row">
                    <label for="field1"><fmt:message key="console.directory.department.common.label.description"/></label>
                    <span class="form-input"><form:textarea path="description" cssErrorClass="form-input-error" /></span>
                </div>
            </fieldset>
            <div class="form-buttons">
                <input class="form-button" type="button" value="<ui:msgEscHTML key="general.method.label.save"/>"  onclick="validateField()"/>
                <input class="form-button" type="button" value="<ui:msgEscHTML key="general.method.label.cancel"/>" onclick="closeDialog()"/>
            </div>
        </form:form>
    </div>

    <script type="text/javascript">
        function validateField() {
            var idMatch = /^[0-9a-zA-Z_-]+$/.test($("#id").val());
            var oversize = $("[name=description]").val().length > 255;

            if (!idMatch && oversize) {
                alert('<ui:msgEscJS key="console.directory.department.error.label.idInvalid"/>\n' + '<ui:msgEscJS key="console.directory.department.error.label.descriptionLimit"/>');
                $("#id").focus();
            } else if (!idMatch) {
                alert('<ui:msgEscJS key="console.directory.department.error.label.idInvalid"/>');
                $("#id").focus();
            } else if (oversize) {
                alert('<ui:msgEscJS key="console.directory.department.error.label.descriptionLimit"/>');
            } else {
                $("#createDept").submit();
            }
        }

        function closeDialog() {
            if (parent && parent.PopupDialog.closeDialog) {
                parent.PopupDialog.closeDialog();
            }
            return false;
        }
    </script>
<commons:popupFooter />
