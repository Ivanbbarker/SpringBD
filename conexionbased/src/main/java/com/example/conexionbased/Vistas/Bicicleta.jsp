<!-- esta es la vista para ver las bibicletas y poder hacer un CRUD con ellas-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="util" uri="http://java.sun.com/jsp/jstl/functions"%>


<tiles:insertAttribute name="header" />
<tiles:insertAttribute name="menu" />
<tiles:insertAttribute name="footer" />

<tiles:insertAttribute name="content" />

<tiles:insertAttribute name="content">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1 class="text-center">Bicicletas</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="table-responsive">
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Marca</th>
                                <th>Modelo</th>
                                <th>Color</th>
                                <th>Numero de serie</th>
                                <th>Fecha de compra</th>
                                <th>Fecha de venta</th>
                                <th>Estado</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${bicicletas}" var="bicicleta">
                                <tr>
                                    <td>${bicicleta.id}</td>
                                    <td>${bicicleta.marca}</td>
                                    <td>${bicicleta.modelo}</td>
                                    <td>${bicicleta.color}</td>
                                    <td>${bicicleta.numeroSerie}</td>
                                    <td>${bicicleta.fechaCompra}</td>
                                    <td>${bicicleta.fechaVenta}</td>
                                    <td>${bicicleta.estado}</td>
                                    <td>
                                        <a href="editarBicicleta?id=${bicicleta.id}">Editar</a>
                                        <a href="eliminarBicicleta?id=${bicicleta.id}">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <a href="crearBicicleta" class="btn btn-primary">Crear</a>
            </div>
        </div>
    </div>
</tiles:insertAttribute>

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