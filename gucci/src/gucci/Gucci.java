package gucci;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Gucci {
	public static void main(String[] args) {
		String title = "��GUCCI��";
		String menu = "�籸���ϱ�\n������Ʈ ��ȸ\n��ŷ�����\n�곪����";
		
		String errMsg = "�ٽ� �õ����ּ���.";
		String homeMsg = "���� �޴��� �̵��մϴ�!";
		
		String a_category_msg = "�翩��\n�賲��\n����θ޴��� �̵�";
		
		String a_Women_b_category_msg = "���ڵ��\n�豸��\n����θ޴��� �̵�";
		String a_Men_b_category_msg = "������\n���мǼ�ǰ\n����θ޴��� �̵�";
		
		String a_Women_b_handbag_c_category_msg = "�籸���� ����\n��̴Ϲ�\n����θ޴��� �̵�";
		String a_Women_b_shoes_c_category_msg = "�罽����\n�轺��Ŀ��\n����θ޴��� �̵�";
		
		String a_Men_b_wallet_c_category_msg = "��������&������\n���Ŀ�ġ\n����θ޴��� �̵�";
		String a_Men_b_things_c_category_msg = "�����&�ð�\n����̿���\n����θ޴��� �̵�";
		
		String a_b_c_handbagList = "�籸�� 1955 Ȧ���� ��Ŷ��(��1,940,000)\n��[����ϼ���] ���� GG �����(��2,620,000)\n����θ޴��� �̵�";
		
		String handbag1Name = "���� 1955 Ȧ���� ��Ŷ��";
		int handbag1Price = 40_000;
		
		String handbag2Name = "[����ϼ���] ���� GG �����";
		int handbag2Price = 2_620_000;
		
		int choice = 0;
		
		int money = 1_000_000_000;
		int point = 0;
		
		//flag : ��� ���� ������ ��� ������ �����Ǳ� ����� ������ ǥ�ø� �س��� �������´�.
		//�� �Ŀ� �ϴܿ��� �ϰ�ó�� ���ش�.
		boolean isPointPayment = false;
		
		//����ڰ� ������ ��ǰ��
		String name = "";
		
		//����ڰ� ������ ��ǰ ����
		int price = 0;
		
		//�ŷ� ���� �޼����� ���� ����
		String orderList = "";
		String temp = null;
		
		//���� ���
		String way_of_pay = "";
		
		//������ �ð�
		String time = null;
		
		while(true) {
			//�� �� true�� �ٲ� flag�� �ٽ� false�� �ʱ�ȭ�ϴ� �۾�
			isPointPayment = false;
			
			//���� �޴�
			choice = Integer.parseInt(
					JOptionPane.showInputDialog(title + "\n" + menu));
			
			//������ ����
			if(choice == 4) {break;}
			switch(choice) {
			//�����ϱ� ����
			case 1:
				//������ ����
				//1. �޸� ȿ��
				//2. �������� ��������.
				choice = Integer.parseInt(
						JOptionPane.showInputDialog(a_category_msg));
				
				//��ī�װ�
				//nested switch��
				switch(choice) {
				//����
				case 1:
					choice = Integer.parseInt(
							JOptionPane.showInputDialog(a_Women_b_category_msg));
					//��ī�װ�
					switch(choice) {
					//�ڵ��
					case 1:
						//��ī�װ�
						choice = Integer.parseInt(
								JOptionPane.showInputDialog(a_Women_b_handbag_c_category_msg));
						
						//��ǰ ����Ʈ
						switch(choice) {
						//������ ����
						case 1:
							choice = Integer.parseInt(
									JOptionPane.showInputDialog(a_b_c_handbagList));
							switch(choice) {
							//Ȧ����
							case 1:
								//��� ��ǰ ���Ž� �ܾ� �˻縦 �����ؾ� �Ѵ�.
								//������ ��ǰ���� ������ �ߺ��� �ڵ�� ����
								//��ȿ������ ���α׷��� ���������.
								//���� ����ڰ� ������ ��ǰ��� ��ǰ ������ �� name, price ������
								//��� �ϴܿ��� �ϰ�ó���Ѵ�.
								name = handbag1Name;
								price = handbag1Price;
								break;
							//����ϼ���
							case 2:
								name = handbag2Name;
								price = handbag2Price;
								break;
							//���� �޴��� �̵�
							case 3:
								JOptionPane.showMessageDialog(null, homeMsg);
								//�������� ������ �ƴ� ��� �ϴ� ���� �������� �������� �ȵǱ� ������
								//continue�� �����ش�.
								continue;
							//�� �� ����
							default:
								JOptionPane.showMessageDialog(null, errMsg);
								continue;
							}
							break;
						//�̴Ϲ�
						case 2:
							break;
						//���� �޴��� �̵�
						case 3:
							JOptionPane.showMessageDialog(null, homeMsg);
							continue;
						//�� �� ����
						default:
							JOptionPane.showMessageDialog(null, errMsg);
							continue;
						}
						break;
					//����
					case 2:
						break;
					//���� �޴��� �̵�
					case 3:
						JOptionPane.showMessageDialog(null, homeMsg);
						continue;
					//�� �� ����
					default:
						JOptionPane.showMessageDialog(null, errMsg);
						continue;
					}
					break;
				//����
				case 2:
					break;
				//���� �޴��� �̵�
				case 3:
					JOptionPane.showMessageDialog(null, homeMsg);
					continue;
				//�� �� ����
				default:
					JOptionPane.showMessageDialog(null, errMsg);
					continue;
				}
				break;
			//����Ʈ ��ȸ ����
			case 2:
				JOptionPane.showMessageDialog(null, "���� �ܿ� ����Ʈ : " + point + "��");
				continue;
			//�ŷ� ���� ����
			case 3:
				//���� orderList�� ���� �� ���� �ʴٸ� ��� ��ǰ�� ���Ÿ� �õ��� ����
				//���� ���̹Ƿ� ������ �޼����� ������ش�.
				//�� ���� �����ϸ� [�ŷ� ����] ������ ��ܿ� �����Ͽ� ����Ѵ�.
				JOptionPane.showMessageDialog(null,
						orderList.equals("") ? "�ŷ��� ������ �����ϴ�." :
							"[�ŷ� ����]\n" + orderList);
				continue;
			//�� �� ����
			default:
				JOptionPane.showMessageDialog(null, errMsg);
				continue;
			}

			//���� ����
			if(money - price < 0) {
				//�ܾ� ����
				time = new SimpleDateFormat("YYYY�� MM�� dd�� HH:mm:ss").format(new Date());
				temp = name + "���� ���� / �ܾ� ����";
				//�ŷ� ������ �ֽ� ������ ���� ��ܿ� ��ġ�ؾ� �ϹǷ�
				//���� ����(orderList)�� �ű� ����(temp)�ڿ� ������ �ش�.
				orderList = temp + " / " + time + "\n" + orderList;
				System.out.println(orderList);
				JOptionPane.showMessageDialog(null, temp);
			}else {
				//���� ����
				//����Ʈ ��� ��ȹ��
				// 1���̶� �ִٸ� �ڵ� ����
				// ����Ʈ�� ���� ���� �� ���� �ܾ� ǥ�� X
				// ����Ʈ + ���� ���� �� ���� �ܾ� ǥ��
				// ���� ���� ���� �ÿ��� ����Ʈ ����
				// ����Ʈ�� ��ǰ ������ 50%����
				
				if(point > 0) {
					//����Ʈ�� 1���̶� �ִٸ� ������ ����
					if(point - price < 0) {
						//����Ʈ�� ��ǰ�� ������ �� ���� �� ������ ����
						//���� + ����Ʈ
						
						//������ ��ǰ ���ݿ��� ��� ������ ����Ʈ ��θ� �������ش�.
						money -= price - point;
						
						//������ ���� ����߱� ������ 0���� �ʱ�ȭ���ش�.
						point = 0;
						
						//�ŷ� �������� ����ϱ� ���� ���� ��� �޼����� ����ش�.
						way_of_pay = "���� + ����Ʈ ����";
					}else {
						//����Ʈ
						//����Ʈ�� ��ǰ�� ������ �� �ֱ� ������ point���� price��ŭ ���ش�.
						point -= price;
						
						//�ϴܿ��� ���� �Ϸ� �޼����� ����� ��
						//����Ʈ�� ����ߴٸ� ���� �ܾ��� ������� �ʴ´�.
						//flag�� ����ؼ� true�� �����Ͽ� ����Ʈ ���������� ǥ�����ش�.
						isPointPayment = true;
						way_of_pay = "����Ʈ ����";
					}
				}else {
					//���� ����
					money -= price;
					//���� ���� ������ ������ ������ 50%�� ����Ʈ ����
					point += price * 0.5;
					way_of_pay = "���� ����";
				}
				//�޽��� ���(���� ���� ����)
				time = new SimpleDateFormat("YYYY�� MM�� dd�� HH:mm:ss").format(new Date());
				temp = name + "���� ����";
				orderList = temp + " / " + way_of_pay + " / " + price + 
						(isPointPayment ? "��" : "��") //����Ʈ ������ ������ ������ ǥ��
						+ " / " + time +"\n" + orderList;
				
				//����Ʈ ������ �ƴ� ������ ���� �ܾ� ���
				temp = isPointPayment ? temp : temp + "\n���� �ܾ� : " + money + "��";
				JOptionPane.showMessageDialog(null, temp);
			}
		}
	}
}



