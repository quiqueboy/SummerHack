from django.shortcuts import render
import folium

# Create your views here.
def inicio(request):
    return render(request, 'index.html')

def metro(request):
    m=folium.Map(location=[])
    return render(request, 'metro.html')

def metrobus(request):
    return render(request, 'metrobus.html')