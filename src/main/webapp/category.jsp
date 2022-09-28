<%@ page import="model.DanhMuc" %>
<%@ page import="dao.DAO" %>
<%@ page import="dao.DanhMucDAOImpl" %>
<%@ page import="java.text.NumberFormat" %><%--
  Created by IntelliJ IDEA.
  User: vulm
  Date: 9/12/2022
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">

    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">

    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</head>
<body>
<%
    DanhMucDAOImpl danhMucDAO = new DanhMucDAOImpl();
%>
<div class="col-sm-3">
    <div class="left-sidebar">
        <h2>Danh Mục</h2>
        <div><!--category-productsr-->
            <%for (DanhMuc danh_muc_cha : danhMucDAO.getListDanhMucCha()) {%>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title">
                        <a>
                            <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                            <%=danh_muc_cha.getTen_danh_muc() %>
                        </a>
                    </h4>
                </div>
                <div class="panel-body">
                    <ul>
                        <%for (DanhMuc danh_muc_con : danhMucDAO.getListDanhMucCon(danh_muc_cha.getMa_danh_muc())) {%>
                        <li>
                            <a href="index.jsp?ma_danh_muc=<%=danh_muc_con.getMa_danh_muc()%>"><%=danh_muc_con.getTen_danh_muc() %>
                            </a></li>
                        <%
                            }
                        %>
                    </ul>
                </div>
            </div>
            <%
                }
            %>
        </div>
        <div style="clear: both; margin-bottom: 10px"></div>
    </div><!--/category-products-->
</div>
</body>
</html>
