<%@ page import="dao.SanPhamDAOImpl" %>
<%@ page import="model.SanPham" %>
<%@ page import="dao.DanhMucDAOImpl" %>
<%@ page import="java.text.NumberFormat" %><%--
  Created by IntelliJ IDEA.
  User: vulm
  Date: 9/12/2022
  Time: 3:22 PM
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
    SanPhamDAOImpl sanPhamDAO = new SanPhamDAOImpl();
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMinimumIntegerDigits(0);
%>


<div class="col-sm-9 padding-right">
    <div class="features_items"><!--features_items-->
        <h2 class="title text-center">Sản Phầm</h2>
        <%for (SanPham sp : sanPhamDAO.getListProductByCategory(Integer.parseInt(request.getParameter("ma_danh_muc")))) {%>
        <div class="col-sm-4">
            <div class="product-image-wrapper">
                <div class="single-products">
                    <div class="productinfo text-center">
                        <img src="<%=sp.getHinh_anh()%>" alt=""/>
                        <h2><%=nf.format(sp.getDon_gia())%>USD</h2>
                        <p><%=sp.getTen_san_pham()%></p>
                        <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ </a>
                    </div>
                    <div class="product-overlay">
                        <div class="overlay-content">
                            <h2><%=nf.format(sp.getDon_gia())%>USD</h2>
                            <p><%=sp.getTen_san_pham()%>n</p>
                            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Thêm vào giỏ</a>
                        </div>
                    </div>
                </div>
                <div class="choose">
                    <ul class="nav nav-pills nav-justified">
                        <li><a href="#"><i class="fa fa-plus-square"></i>Thêm danh sách</a></li>
                        <li><a href="detail.jsp?ma_san_pham=<%=sp.getMa_san_pham()%>"><i class="fa fa-plus-square"></i>Xem Chi tiết</a></li>
                    </ul>
                </div>
            </div>
        </div>
<%
    }
%>

</div>
</div>

</body>
</html>
