package gucci;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Gucci {
	public static void main(String[] args) {
		String title = "▒GUCCI▒";
		String menu = "①구매하기\n②포인트 조회\n③거래내역\n④나가기";
		
		String errMsg = "다시 시도해주세요.";
		String homeMsg = "메인 메뉴로 이동합니다!";
		
		String a_category_msg = "①여성\n②남성\n③메인메뉴로 이동";
		
		String a_Women_b_category_msg = "①핸드백\n②구두\n③메인메뉴로 이동";
		String a_Men_b_category_msg = "①지갑\n②패션소품\n③메인메뉴로 이동";
		
		String a_Women_b_handbag_c_category_msg = "①구찌의 선택\n②미니백\n③메인메뉴로 이동";
		String a_Women_b_shoes_c_category_msg = "①슬리퍼\n②스니커즈\n③메인메뉴로 이동";
		
		String a_Men_b_wallet_c_category_msg = "①장지갑&반지갑\n②파우치\n③메인메뉴로 이동";
		String a_Men_b_things_c_category_msg = "①쥬얼리&시계\n②아이웨어\n③메인메뉴로 이동";
		
		String a_b_c_handbagList = "①구찌 1955 홀스빗 버킷백(￦1,940,000)\n②[디오니서스] 스몰 GG 숄더백(￦2,620,000)\n③메인메뉴로 이동";
		
		String handbag1Name = "구찌 1955 홀스빗 버킷백";
		int handbag1Price = 40_000;
		
		String handbag2Name = "[디오니서스] 스몰 GG 숄더백";
		int handbag2Price = 2_620_000;
		
		int choice = 0;
		
		int money = 1_000_000_000;
		int point = 0;
		
		//flag : 어떠한 영역 내에서 모든 로직이 구현되기 어려울 때에는 표시만 해놓고 빠져나온다.
		//그 후에 하단에서 일괄처리 해준다.
		boolean isPointPayment = false;
		
		//사용자가 선택한 상품명
		String name = "";
		
		//사용자가 선택한 상품 가격
		int price = 0;
		
		//거래 내역 메세지를 담을 변수
		String orderList = "";
		String temp = null;
		
		//결제 방식
		String way_of_pay = "";
		
		//구매한 시간
		String time = null;
		
		while(true) {
			//한 번 true로 바뀐 flag를 다시 false로 초기화하는 작업
			isPointPayment = false;
			
			//메인 메뉴
			choice = Integer.parseInt(
					JOptionPane.showInputDialog(title + "\n" + menu));
			
			//나가기 영역
			if(choice == 4) {break;}
			switch(choice) {
			//구매하기 영역
			case 1:
				//변수의 재사용
				//1. 메모리 효율
				//2. 가독성이 떨어진다.
				choice = Integer.parseInt(
						JOptionPane.showInputDialog(a_category_msg));
				
				//대카테고리
				//nested switch문
				switch(choice) {
				//여성
				case 1:
					choice = Integer.parseInt(
							JOptionPane.showInputDialog(a_Women_b_category_msg));
					//중카테고리
					switch(choice) {
					//핸드백
					case 1:
						//소카테고리
						choice = Integer.parseInt(
								JOptionPane.showInputDialog(a_Women_b_handbag_c_category_msg));
						
						//상품 리스트
						switch(choice) {
						//구찌의 선택
						case 1:
							choice = Integer.parseInt(
									JOptionPane.showInputDialog(a_b_c_handbagList));
							switch(choice) {
							//홀스빗
							case 1:
								//모든 상품 구매시 잔액 검사를 진행해야 한다.
								//하지만 상품마다 구현시 중복된 코드로 인해
								//비효율적인 프로그램이 만들어진다.
								//따라서 사용자가 선택한 상품명과 상품 가격을 각 name, price 변수에
								//담고 하단에서 일괄처리한다.
								name = handbag1Name;
								price = handbag1Price;
								break;
							//디오니서스
							case 2:
								name = handbag2Name;
								price = handbag2Price;
								break;
							//메인 메뉴로 이동
							case 3:
								JOptionPane.showMessageDialog(null, homeMsg);
								//정상적인 선택이 아닌 경우 하단 결제 영역으로 내려가면 안되기 때문에
								//continue로 막아준다.
								continue;
							//그 외 영역
							default:
								JOptionPane.showMessageDialog(null, errMsg);
								continue;
							}
							break;
						//미니백
						case 2:
							break;
						//메인 메뉴로 이동
						case 3:
							JOptionPane.showMessageDialog(null, homeMsg);
							continue;
						//그 외 영역
						default:
							JOptionPane.showMessageDialog(null, errMsg);
							continue;
						}
						break;
					//구두
					case 2:
						break;
					//메인 메뉴로 이동
					case 3:
						JOptionPane.showMessageDialog(null, homeMsg);
						continue;
					//그 외 영역
					default:
						JOptionPane.showMessageDialog(null, errMsg);
						continue;
					}
					break;
				//남성
				case 2:
					break;
				//메인 메뉴로 이동
				case 3:
					JOptionPane.showMessageDialog(null, homeMsg);
					continue;
				//그 외 영역
				default:
					JOptionPane.showMessageDialog(null, errMsg);
					continue;
				}
				break;
			//포인트 조회 영역
			case 2:
				JOptionPane.showMessageDialog(null, "현재 잔여 포인트 : " + point + "점");
				continue;
			//거래 내역 영역
			case 3:
				//만약 orderList에 값이 들어가 있지 않다면 어떠한 상품도 구매를 시도한 적이
				//없는 것이므로 적절한 메세지를 출력해준다.
				//한 개라도 존재하면 [거래 내역] 문구를 상단에 연결하여 출력한다.
				JOptionPane.showMessageDialog(null,
						orderList.equals("") ? "거래한 내역이 없습니다." :
							"[거래 내역]\n" + orderList);
				continue;
			//그 외 영역
			default:
				JOptionPane.showMessageDialog(null, errMsg);
				continue;
			}

			//결제 영역
			if(money - price < 0) {
				//잔액 부족
				time = new SimpleDateFormat("YYYY년 MM월 dd일 HH:mm:ss").format(new Date());
				temp = name + "결제 실패 / 잔액 부족";
				//거래 내역은 최신 내역이 가장 상단에 위치해야 하므로
				//기존 내역(orderList)을 신규 내역(temp)뒤에 연결해 준다.
				orderList = temp + " / " + time + "\n" + orderList;
				System.out.println(orderList);
				JOptionPane.showMessageDialog(null, temp);
			}else {
				//결제 성공
				//포인트 사용 기획안
				// 1점이라도 있다면 자동 소진
				// 포인트로 전액 결제 시 현재 잔액 표시 X
				// 포인트 + 현금 결제 시 현재 잔액 표시
				// 전액 현금 결제 시에만 포인트 적립
				// 포인트는 상품 가격의 50%적립
				
				if(point > 0) {
					//포인트가 1점이라도 있다면 들어오는 영역
					if(point - price < 0) {
						//포인트로 상품을 구매할 수 없을 때 들어오는 영역
						//현금 + 포인트
						
						//구매할 상품 가격에서 사용 가능한 포인트 모두를 차감해준다.
						money -= price - point;
						
						//위에서 전부 사용했기 때문에 0으로 초기화해준다.
						point = 0;
						
						//거래 내역에서 사용하기 위해 결제 방식 메세지를 담아준다.
						way_of_pay = "현금 + 포인트 결제";
					}else {
						//포인트
						//포인트로 상품을 구매할 수 있기 때문에 point에서 price만큼 빼준다.
						point -= price;
						
						//하단에서 결제 완료 메세지를 출력할 때
						//포인트만 사용했다면 현재 잔액을 출력하지 않는다.
						//flag를 사용해서 true로 변경하여 포인트 결제인지를 표시해준다.
						isPointPayment = true;
						way_of_pay = "포인트 결제";
					}
				}else {
					//전액 현금
					money -= price;
					//전액 현금 결제시 결제한 가격의 50%를 포인트 적립
					point += price * 0.5;
					way_of_pay = "현금 결제";
				}
				//메시지 출력(결제 성공 영역)
				time = new SimpleDateFormat("YYYY년 MM월 dd일 HH:mm:ss").format(new Date());
				temp = name + "결제 성공";
				orderList = temp + " / " + way_of_pay + " / " + price + 
						(isPointPayment ? "점" : "원") //포인트 결제시 가격을 점으로 표시
						+ " / " + time +"\n" + orderList;
				
				//포인트 결제가 아닐 때에만 현재 잔액 출력
				temp = isPointPayment ? temp : temp + "\n현재 잔액 : " + money + "원";
				JOptionPane.showMessageDialog(null, temp);
			}
		}
	}
}



