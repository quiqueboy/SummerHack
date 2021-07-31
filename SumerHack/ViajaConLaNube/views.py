from django.shortcuts import render

# Create your views here.
def inicio(request):
    return render(request, 'index.html')

def metro(request):
    return render(request, 'metro.html')

def metrobus(request):
    return render(request, 'metrobus.html')