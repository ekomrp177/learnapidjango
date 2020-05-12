from rest_framework import serializers
from . models import employees

class employeesSerializer(serializers.ModelSerializer):
    class Meta:
        model=employees
#        fields=('firstName','lastName')
        fields='__all__'