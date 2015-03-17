package com.savi.ciudadano.prueba;
import java.io.File;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.importer.ZipImporter;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.savi.ciudadano.ejb.CiudadanoImpl;
import com.savi.ciudadano.ejb.local.CiudadanoLocal;
import com.savi.ciudadano.modelo.ServicioDAO;
import com.savi.ciudadano.modelo.entidades.Ciudadano;

@RunWith(Arquillian.class)
public class CiudadanoTest {

	@EJB
	CiudadanoLocal ciudadano;
	
	

	   private static final String FILE_NAME = CiudadanoTest.class.getSimpleName();
	   
	 private static String getPath(String projectName, String version) {
	        return ".." + File.separator + projectName + File.separator + "target"
	                + File.separator + projectName + "-" + version + ".jar";
	    }

	    @Deployment
	    public static JavaArchive deploy() {
	        System.out.println("Deploy class: " + FILE_NAME);
	        String jarName = FILE_NAME + ".jar";
	        JavaArchive jar = null;

	        jar = ShrinkWrap
	                .create(ZipImporter.class, jarName)
	                .as(JavaArchive.class);
	        
	        jar.addClass(CiudadanoImpl.class).addPackage(CiudadanoLocal.class.getPackage())
	        .addPackage(CiudadanoImpl.class.getPackage()).addClass(ServicioDAO.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml")
	        .addAsResource("persistence.xml");
	        

	     	        System.out.println("File " + FILE_NAME + "deployed...");
	        return jar;
	    }
	    
	    @Test
		public void testGuardar() {
			ciudadano.guardar(new Ciudadano("Ramon", "Rodriguez", 'M'));
		}
}
