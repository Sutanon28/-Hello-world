<?php
	$objConnect = mysql_connect("ap-cdbr-azure-southeast-b.cloudapp.net","b867729f77709e","b9e0253c");
	$objDB = mysql_select_db("foodcal");
	//require 'connect.php';

	//$_POST["type"] = "keep";

	//date_default_timezone_set("Asia/Bangkok");

	$type = $_POST["type"];

	//$strSQL = "SELECT * FROM food WHERE 1 AND Q_Tel = '".$strIMEI."'  AND Q_Date = '".$cur_date."' AND Q_Status = 0 ";
	$strSQL = "SELECT * FROM forest WHERE f_type =  '".$type."' " ;

	$objQuery = mysql_query($strSQL);
	$obResult = mysql_fetch_array($objQuery);
	//$intNumField = mysql_num_fields($objQuery);
	//$resultArray = array();

	$arr["f_detail"] = $obResult["f_detail"];
	$arr["f_pic"] = $obResult["f_pic"];


  mysql_close($objConnect);

  echo json_encode($arr);
?>
