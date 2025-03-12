<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <html>
            <body>
                <h2>1 Bulbasur</h2>

                <table border="1">
                    <tr>
                        <th>efectividad</th>
                        <th>fuego</th>
                    </tr>
                    <xsl:for-each select="pokedex/pokemon/tipologia/debilidades/debilidad">
                        <tr>
                            <td>
                                <xsl:value-of select="tipo"/>
                            </td>
                            <td>
                                <xsl:value-of select="efectividad"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <br />
                <table border="1">
                    <tr>
                        <th>habilidad</th>
                        <xsl:for-each select="pokedex/pokemon/datos_generales">
                            <td>
                                <xsl:value-of select="habilidad"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>categoria</th>
                        <xsl:for-each select="pokedex/pokemon/datos_generales">
                            <td>
                                <xsl:value-of select="categoria"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>sexo</th>
                        <xsl:for-each select="pokedex/pokemon/datos_generales">
                            <td>
                                <xsl:value-of select="sexo"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>peso</th>
                        <xsl:for-each select="pokedex/pokemon/datos_generales">
                            <td>
                                <xsl:value-of select="peso"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>altura</th>
                        <xsl:for-each select="pokedex/pokemon/datos_generales">
                            <td>
                                <xsl:value-of select="altura"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                </table>
                <br />
                <table border="1">
                    <tr>
                        <th>descripcion</th>
                    </tr>
                    <xsl:for-each select="pokedex/pokemon/tipologia/tipos/tipo">
                        <tr>
                            <td>
                                <xsl:value-of select="descripcion"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
                <br />
                <table border="1">
                    <tr>
                        <th>vel</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="vel"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>spde</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="spde"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>spat</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="spat"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>def</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="def"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>at</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="at"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <th>ps</th>
                        <xsl:for-each select="pokedex/pokemon/stats_base">
                            <td>
                                <xsl:value-of select="ps"/>
                            </td>
                        </xsl:for-each>
                    </tr>
                </table>
                <br/>
                <table border="1">
                    <tr>
                        <th>orden</th>
                        <th>num_pokedex</th>
                    </tr>
                    <xsl:for-each select="pokedex/pokemon/evoluciones/evolucion">
                        <tr>
                            <td>
                                <xsl:value-of select="orden"/>
                            </td>
                            <td>
                                <xsl:value-of select="num_pokedex"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>