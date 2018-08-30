<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<h3 align="center">비밀번호 변경</h3>
<form id ="updateform">
<table style="margin:auto" >
	<tr>
		<td rowspan="3" colspan="2">
		<img src="" alt="" style="width:400px; height: 300px" />
		</td>
		<td>ID</td>
		<td>${user.userid}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td id="name"></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><input type="text" id ="password" name="password" /></td>
	</tr>
	<tr>
		<td>나이</td>
		<td id="age"></td>
		<td>팀명</td>
		<td>
			<select id="teamid" name="teamid" >
				<option class= "option" value="지은이가지은집" >지은이가지은집</option>
				<option class= "option" value="코딩짱">코딩짱</option>
				<option class= "option" value="왕꼬북이">왕꼬북이</option>
				<option class= "option" value="걍놀자">걍놀자</option>
			</select></td>
	</tr>
	<tr>
		<td>성별</td>
		<td id="gender"></td>
		<td>역할</td>
		<td>
			<select id="roll" name="roll" >
			 <option class= "roll" value="팀장" >팀장</option>
			<option class= "roll" value="팀원" >	팀원</option>
			<option class= "roll" value="프론트개발" >프론트개발</option>
			<option class= "roll" value="백단개발" >백단개발</option>
			<option class= "roll" value="민폐" >민폐</option>
			</select>
			</td>
	</tr>
</table>
	
	<br /><input id="updateform_Btn" style="margin-left: 70%; width=100px "  type="button" value="수정" />
</form>
<%-- 	<form method="POST" enctype="multipart/form-data" action="${context}/member.do?action=fileupload&page=retrieve" style="margin-left: 400px">
  		파일업로드 : <input type="file" name="upfile"><br/>
	  <input type="submit" value="파일업로드">
	 
  </form> --%>




