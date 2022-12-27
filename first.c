#include <stdio.h>

int main()
{

    int a[6], b[6], c[6], i, j, k;
    for (i = 0; i < 3; i++)
    {

        printf("number of elements A:");
        scanf("%d", &a[i]);
    }
    for (j = 0; j < 3; j++)
    {

        printf("number of elments B:");

        scanf("%d", &b[j]);
    }

    for (i = 0; i < 3; i++)
    {

        c[i] = a[i];
    }

    for (j = 0; j < 3; j++)
    {

        c[3 + j] = b[j];


    }
     printf("union");

    for (i = 0; i < 6; i++)
    {

        k = 0;

        for (j = i + 1; j < 6; j++)

        {

            if (c[i] == c[j])
            {
                k = 1;

                break;
            }
        }

        if (k == 1)
        {

            printf("%d\t", c[i]);
        }
    }

    return 0;
}
