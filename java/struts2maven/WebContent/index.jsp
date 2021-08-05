<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<body>
	<s:form action="HelloWorld">
		<s:textfield name="Name" label="Name" />
		<s:submit />
	</s:form>
</body>
</html>