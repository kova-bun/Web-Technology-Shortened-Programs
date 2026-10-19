<?xml version="1.0" encoding="UTF-8"?>
<html xsl:version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<body style="font:12pt Arial;background:#eee">
<h2>Book Details</h2>
<table border="1" cellpadding="8" cellspacing="0" style="border-collapse:collapse;width:80%;background:white">
<tr style="background:blue;color:white">
<th>Tittle</th><th>Author</th><th>ISBN</th>
<th>Publisher</th><th>Edition</th><th>Price</th>
</tr>
<xsl:for-each select="library/book">
<tr>
<td><xsl:value-of select="Tittle"/></td>
<td><xsl:value-of select="Author"/></td>
<td><xsl:value-of select="ISBN"/></td>
<td><xsl:value-of select="Publisher"/></td>
<td><xsl:value-of select="Edition"/></td>
<td><xsl:value-of select="Price"/></td>
</tr>
</xsl:for-each>
</table>
</body>
</html>