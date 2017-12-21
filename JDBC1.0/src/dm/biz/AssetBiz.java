package dm.biz;

import java.util.List;

import dm.po.Asset;

public interface AssetBiz {
	// 1 ���ӲƲ�
	public boolean add(Asset a);

	// 2 ɾ���Ʋ�
	public boolean delete(String Ano);

	// 3 �޸ĲƲ�
	public boolean update(Asset a);

	// 4����ѧ�Ų��ҲƲ�
	public Asset findById(String Ano);

	// 5 ��ѯ����
	public List<Asset> findAll();

	// 6 ģ����ѯ
	public List<Asset> findByCondition(String condition);

}