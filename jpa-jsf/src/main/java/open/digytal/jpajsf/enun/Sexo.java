package open.digytal.jpajsf.enun;

public enum Sexo {
	
	FEMININO("Feminino"),MASCULINO("Masculino");
	
	private String opcaoSexo;
	
	Sexo(String opcaoSexo){
		this.opcaoSexo=opcaoSexo;
		

}

	public String getOpcaoSexo() {
		return opcaoSexo;
	}

	public void setOpcaoSexo(String opcaoSexo) {
		this.opcaoSexo = opcaoSexo;
	}
}
