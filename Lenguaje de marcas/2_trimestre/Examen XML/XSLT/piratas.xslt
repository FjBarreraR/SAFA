<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <h2>Piratas</h2>
        <br/>
        <h3>Actor</h3>
        <table border="1">
            <tr>
                <th>Nombre completo:</th>
                <th>Sexo:</th>
                <th>Fecha nacimiento:</th>
            </tr>
            <xsl:for-each select="piratas/pirata/datos_actor">
                <tr>
                    <td>
                        <xsl:value-of select="nombre"/>
                        <xsl:value-of select="apellidos"/>
                    </td>
                    <td>
                        <xsl:value-of select="sexo"/>
                    </td>
                    <td>
                        <xsl:value-of select="nacimiento"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
        <br/>
        <h3>Películas</h3>
        <table border="1">
            <tr>
                <th>TITULO</th>
                <th>SAGA</th>
            </tr>
            <xsl:for-each select="piratas/pirata/peliculas/pelicula/datos">
                <tr>
                    <td>
                        <xsl:value-of select="titulo"/>
                    </td>
                    <td>
                        <xsl:value-of select="saga"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
        <br/>
        <h3>Roles</h3>
        <table border="1">
            <tr>
                <th>TIPO</th>
                <th>BARCO</th>
            </tr>
            <xsl:for-each select="piratas/pirata/roles/rol">
                <tr>
                    <td>
                        <xsl:value-of select="tipo_rol"/>
                    </td>
                    <td>
                        <xsl:value-of select="barco"/>
                    </td>
                </tr>
            </xsl:for-each>
        </table>
    </xsl:template>
</xsl:stylesheet>