<?xml version="1.0"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<body style="font:12pt Arial;background:#eee">
<h2>Personal Details</h2>
<table border="1" cellpadding="8" cellspacing="0" style="border-collapse:collapse;width:80%;background:white">
<tr style="background:blue;color:white">
<th>Name</th><th>Phone</th><th>Address</th><th>Email</th>
</tr>
<xsl:for-each select="person_details/person">
<tr>
<td><xsl:value-of select="name"/></td>
<td><xsl:value-of select="phone"/></td>
<td><xsl:value-of select="address"/></td>
<td><xsl:value-of select="email"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>