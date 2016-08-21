package org.zerock.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.mapper.BoardMapper;

//@Repository
public class BoardDAOImpl2 implements BoardDAO {

  @Inject
  private BoardMapper mapper;

  @Override
  public void create(BoardVO vo) throws Exception {
    mapper.create(vo);
  }

  @Override
  public BoardVO read(Integer bno) throws Exception {
    return mapper.read(bno);
  }

  @Override
  public void update(BoardVO vo) throws Exception {
    mapper.update(vo);
  }

  @Override
  public void delete(Integer bno) throws Exception {
    mapper.delete(bno);
  }

  @Override
  public List<BoardVO> listAll() throws Exception {
    return mapper.listAll();
  }

  @Override
  public List<BoardVO> listPage(int page) throws Exception {

    if (page <= 0) {
      page = 1;
    }

    page = (page - 1) * 10;

    return mapper.listPage(page);
  }

  @Override
  public List<BoardVO> listCriteria(Criteria cri) throws Exception {

    return mapper.listCriteria(cri);
  }

  @Override
  public int countPaging(Criteria cri) throws Exception {

    return mapper.countPaging(cri);
  }

  @Override
  public List<BoardVO> listSearch(SearchCriteria cri) throws Exception {

    return mapper.listSearch(cri);
  }

  @Override
  public int listSearchCount(SearchCriteria cri) throws Exception {

    return mapper.listSearchCount(cri);
  }

  @Override
  public void updateReplyCnt(Integer bno, int amount) throws Exception {

    Map<String, Object> paramMap = new HashMap<String, Object>();

    paramMap.put("bno", bno);
    paramMap.put("amount", amount);

    mapper.updateReplyCnt(bno, amount);
  }

  @Override
  public void updateViewCnt(Integer bno) throws Exception {
    
    mapper.updateViewCnt(bno);
    
  }


  @Override
  public void addAttach(String fullName) throws Exception {
    
    mapper.addAttach(fullName);
    
  }
  
  @Override
  public List<String> getAttach(Integer bno) throws Exception {
    
    return mapper.getAttach(bno);
  }
 

  @Override
  public void deleteAttach(Integer bno) throws Exception {

    mapper.deleteAttach(bno);
    
  }

  @Override
  public void replaceAttach(String fullName, Integer bno) throws Exception {
    
    Map<String, Object> paramMap = new HashMap<String, Object>();
    
    paramMap.put("bno", bno);
    paramMap.put("fullName", fullName);
    
    mapper.replaceAttach(fullName, bno);
    
  }

}
