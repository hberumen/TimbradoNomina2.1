package me.hberumen.nomina.bd.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlConfig {
	private static final SqlSessionFactory sqlMapper;

	static {
		try {
			String resource = "me/hberumen/nomina/bd/config/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMapper = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception ex) {
			throw new RuntimeException("Error al inicializar la clase SqlConfig. Causa: " + ex.getMessage());
		}
	}

	public static SqlSessionFactory getSqlMapper() {
		return sqlMapper;
	}
}
