
<!-- Path: src\main\java\com\springweb\taller\Vistas\CrearBicicleta.jsp -->
<!-- esta es la vista para crear una bicicleta -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>


<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="footer" />

<tiles:insertAttribute name="content">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">Crear Bicicleta</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <form:form action="guardarBicicleta" method="post" modelAttribute="bicicleta">
                    <form:input path="marca" />
                    <form:input path="modelo" />
                    <form:input path="color" />
                    <form:input path="numeroSerie" />
                    <form:input path="fechaCompra" />
                    <form:input path="fechaVenta" />
                    <form:input path="estado" />
                    <input type="submit" value="Guardar" />
                </form:form>
            </div>
        </div>
    </div>

</tiles:insertAttribute>