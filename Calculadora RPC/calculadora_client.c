/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */
#include "calculadora.h"
void calc_prog_1(char *host, float x, float y, int op){
	CLIENT *clnt;
	float  *result_1;
	numbers  add_1_arg;
	float  *result_2;
	numbers  sub_1_arg;
	float  *result_3;
	numbers  mult_1_arg;
	float  *result_4;
	numbers  div_1_arg;

#ifndef	DEBUG
	clnt = clnt_create (host, CALC_PROG, CALC_VERS, "udp");
	if (clnt == NULL) {
		clnt_pcreateerror (host);
		exit (1);
	}
#endif	/* DEBUG */
	add_1_arg.a = sub_1_arg.a = mult_1_arg.a = div_1_arg.a = x;
	add_1_arg.b = sub_1_arg.b = mult_1_arg.b = div_1_arg.b = y;

	if (op == 1 || op==0)
	{
		result_1 = add_1(&add_1_arg, clnt);
		if (result_1 == (float *)NULL)
		{
			clnt_perror(clnt, "Falha na chamada\n");
		}
		else
		{
			printf("Resultado Soma: %.2f\n", *result_1);
		}
	}
	if (op == 2 || op==0)
	{
		result_2 = sub_1(&sub_1_arg, clnt);
		if (result_2 == (float *)NULL)
		{
			clnt_perror(clnt, "Falha na chamada\n");
		}
		else
		{
			printf("Resultado Subtracao: %.2f\n", *result_2);
		}
	}
	if (op == 3 || op==0)
	{
		result_3 = mult_1(&mult_1_arg, clnt);
		if (result_3 == (float *)NULL)
		{
			clnt_perror(clnt, "Falha na chamada\n");
		}
		else
		{
			printf("Resultado Multplicacao: %.2f\n", *result_3);
		}
	}
	if (op == 4 || op==0)
	{
		result_4 = div_1(&div_1_arg, clnt);
		if (result_4 == (float *)NULL)
		{
			clnt_perror(clnt, "Falha na chamada\n");
		}
		else
		{
			printf("Resultado Divisao:%.2f\n", *result_4);
		}
	}
#ifndef	DEBUG
	clnt_destroy (clnt);
#endif	 /* DEBUG */
}
int menu(){
	int x = 0;
	printf("1 - soma\n");
	printf("2 - subtracao\n");
	printf("3 - multiplicacao\n");
	printf("4 - divisao\n");
	printf("0 - todas opcoes\n");

	printf("Digite uma opcao: ");
	scanf("%d", &x);
	return x;
}

int main (int argc, char *argv[]){
	char *host;
	if (argc < 4) {
		printf ("usage: %s server_host numero1 numero2\n", argv[0]);
		exit (1);
	}
	host = argv[1];
	calc_prog_1(host, atoi(argv[2]), atoi(argv[3]), menu());
exit (0);
}