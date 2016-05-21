package edu.ndu.fetisov;
import java.util.ArrayList;
// ���� ������ �����������
//
public class Calculator{
/**
	��������� ����������
*/

	private int result, resultDob;
	int j,i, i1;
	float resultDiv;
/**
	������ ���������.
//	@param params ��������� ���������
*/	
//	public void add(int ... params){
//		for (Integer param: params) {
//			this.result += param;

	public void add(ArrayList<Integer> calc){
		//		System.out.println("add"+arg.length);
		result = 0;
		for (i=0; i <calc.size(); i++){
			result += calc.get(i);
		//	System.out.println(i+" "+this.result);
		}
	}

	public void minus(ArrayList<Integer> calc){
		//		System.out.println("minus"+arg.length);
		result = 0;
		for (i=0; i < calc.size(); i++){
			result -= calc.get(i);
			//	System.out.println(i+" "+this.result);
		}
	}

    public void dobutok(ArrayList<Integer> calc){
        //		System.out.println("dobutok"+arg.length);
        result = 1;
        for (i=0; i < calc.size(); i++){
            result *= calc.get(i);
        }
    }

    /**
     * ���������� ������
//     * @param ArrayList<Integer> calc - ����� ���������
     * @throws UserException - ���� ��������� ������, �� ���������� ��� �� � �����������
     */
    public void div(ArrayList<Integer> calc)throws UserException{
		//		System.out.println("div"+arg.length);
		if (calc.size() == 2) {
            resultDiv = (float) calc.get(0)/calc.get(1);
		} else {
            throw new UserException("You should enter args!");
		}
	}

/**
	��������� ��������� ���������
*/

	public int getResult(){ return this.result; }
	public float getResultDiv(){ return this.resultDiv; }
/**
	�������� ���������� ���������
*/

	public void cleanResult()
	{
		result = 0;
		resultDiv = 0;
	}
}