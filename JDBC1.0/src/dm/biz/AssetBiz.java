package dm.biz;

import java.util.List;

import dm.po.Asset;

public interface AssetBiz {
	// 1 ����ѧ��
	public boolean add(Asset a);

	// 2 ɾ��ѧ��
	public boolean delete(String ano);

	// 3 �޸�ѧ��
	public boolean update(Asset a);

	// 4����ѧ�Ų���ѧ��
	public Asset findById(String ano);

	// 5 ��ѯ����
	public List<Asset> findAll();

	// 6 ģ����ѯ
	public List<Asset> findByCondition(String condition);

}