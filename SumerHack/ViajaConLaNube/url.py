from django.urls import path
from . import views
urlpatterns = [
    path('', views.inicio, name="inicio"),
    path('metro/', views.metro, name="metro"),
    path('metrobus/', views.metrobus, name="metrobus"),
]