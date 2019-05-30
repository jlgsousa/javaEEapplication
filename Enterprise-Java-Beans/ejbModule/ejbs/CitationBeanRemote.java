package ejbs;

import dao.CitationChicagoDAO;

import java.util.List;

import javax.ejb.Remote;


@Remote
public interface CitationBeanRemote {
	
	List<CitationChicagoDAO> getCitationChicagoList(String publicacao);

}

