/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */
#include "calculadora.h"

float *add_1_svc(numbers *argp, struct svc_req *rqstp){
	static float  result;
	printf("Funcao soma(%.2f, %.2f) foi chamada\n", argp->a, argp->b);
	result = argp->a + argp->b;
	return &result;
}

float *sub_1_svc(numbers *argp, struct svc_req *rqstp){
	static float  result;
	printf("Funcao subtracao((%.2f, %.2f)  foi chamada\n", argp->a, argp->b);
	result = argp->a - argp->b;
	return &result;	
}

float *mult_1_svc(numbers *argp, struct svc_req *rqstp){
	static float  result;
	printf("Funcao multiplicacao(%.2f, %.2f)  foi chamada\n", argp->a, argp->b);
	result = argp->a * argp->b;
	return &result;
}

float *div_1_svc(numbers *argp, struct svc_req *rqstp){
	static float  result;
	printf("Funcao divisao(%.2f, %.2f)  foi chamada\n", argp->a, argp->b);
	result = argp->a / argp->b;
	return &result;
}